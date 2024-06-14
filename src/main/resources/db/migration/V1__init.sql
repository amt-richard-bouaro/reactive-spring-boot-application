CREATE TABLE profile_tb
(
    id        SERIAL PRIMARY KEY,
    firstname VARCHAR(255)        NOT NULL,
    lastname  VARCHAR(255)        NOT NULL,
    email     VARCHAR(255) UNIQUE NOT NULL
);