CREATE TABLE IF NOT EXISTS credit_products (
    id                      bigserial primary key,              -- id
    name                    text      unique        not null,   -- Название кредитного продукта
    interest_rate           numeric(6,4)            not null,   -- Процентная ставка кредитного продукта
    amount_min              numeric(19,4)           not null,   -- Минимально возможная сумма кредитного продукта
    amount_max              numeric(19,4)           not null,   -- Максимально возможная сумма кредитного продукта
    min_duration_months     int                     not null,   -- Минимальный срок, на который можно взять кредитный продукт, в месяцах
    max_duration_months     int                     not null,   -- Максимальный срок, на который можно взять кредитный продукт, в месяцах
    is_revocable            boolean                 not null,   -- Возможность досрочного погашения (да/нет)
    is_guarantee            boolean                 not null,   -- Необходимость наличия поручителей (да/нет)
    description             text,                               -- Дополнительное описание кредитного продукта
    image                   text,                               -- Ссылка на файл изображения кредитного продукта
    is_active               boolean                 not null    -- Активность кредитного продукта (да/нет)
    );

--Для быстрого поиска по имени кредитного продукта
CREATE EXTENSION IF NOT EXISTS pg_trgm;
CREATE INDEX IF NOT EXISTS credit_products_idx_name ON credit_products USING GIN (name gin_trgm_ops);