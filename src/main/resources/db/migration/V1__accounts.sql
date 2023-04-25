CREATE TABLE accounts (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    active boolean DEFAULT TRUE,
    CONSTRAINT unq_email UNIQUE (email)
)
