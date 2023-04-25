CREATE TABLE cart (
    item_id SERIAL PRIMARY KEY,
    item_name VARCHAR(255) NOT NULL,
    price REAL NOT NULL,
    quantity INTEGER NOT NULL,
    CONSTRAINT unq_itemId UNIQUE (itemId)
)