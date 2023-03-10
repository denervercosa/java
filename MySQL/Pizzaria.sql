CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_pizzas(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	sabor VARCHAR(255),
	borda VARCHAR(4),
    preco DECIMAL(6,2),
    bebida VARCHAR(255)
);
CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	tipo VARCHAR(255),
	tamanho VARCHAR(255)
	);

INSERT INTO tb_pizzas (sabor, borda, preco, bebida)
VALUES ("Caipira", "Com Catupiry", 47.90, "Guarana Antartica 2lts"),
("Mussarela", "Sem Catupiry", 45.99, "Coca-Cola 2lts"),
("Portuguesa", "Com Catupiry", 49.90, "Guarana Jesus 2lts"),
("Sensação", "Com Nutella", 59.90, "Fanta Laranja 2lts"),
("Nutella", "Sem Borda", 57.90, "Fanta Uva 2lts"),
("Marguerita", "Com Catupiry", 49.99, "Fanta Guarana 2lts"),
("Atum", "Sem Borda", 50.00, "Coca-Cola zero 2lts"),
("Chocolate com Banana", "Com Nutella", 59.90, "Guarana Antartica zero 2lts");

ALTER TABLE tb_pizzas MODIFY borda VARCHAR(255);
