CREATE TABLE cliente (id SERIAL PRIMARY KEY,nome VARCHAR(60) NOT NULL, email VARCHAR(50) NOT NULL UNIQUE);
INSERT INTO (nome, email) VALUES ('Marcos','marcos@gmail.com');
SELECT * FROM cliente