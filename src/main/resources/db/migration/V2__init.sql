CREATE TABLE profile_tb_v2
(
    id        SERIAL PRIMARY KEY,
    first_name VARCHAR(255)        NOT NULL,
    last_name  VARCHAR(255)        NOT NULL,
    email     VARCHAR(255) UNIQUE NOT NULL
);