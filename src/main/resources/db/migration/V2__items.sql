CREATE TABLE items (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    price REAL NOT NULL,
    stock INTEGER NOT NULL,
    created_date DATE,
    updated_date DATE,
    CONSTRAINT unq_name UNIQUE (name)
)
