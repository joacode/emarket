-- ACCOUNTS
INSERT INTO accounts(id, email, password, active) VALUES (1, 'joaco@email.com', 'pass123', TRUE) ON CONFLICT (id) DO NOTHING;
INSERT INTO accounts(id, email, password, active) VALUES (2, 'gabi@email.com', 'pass123', TRUE) ON CONFLICT (id) DO NOTHING;

-- ITEMS
-- ACCOUNTS
INSERT INTO items(id, name, price, stock) VALUES (1, 'termo', 100, 5) ON CONFLICT (id) DO NOTHING;
INSERT INTO items(id, name, price, stock) VALUES (2, 'mate', 10, 10) ON CONFLICT (id) DO NOTHING;