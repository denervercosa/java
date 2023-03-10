-- Comando para criação de banco de dados
CREATE DATABASE db_ecommerce;

-- Comando que indica ao mysql workbench o banco de dados usado
USE db_ecommerce;

-- Comando para criação de tabelas
CREATE TABLE tb_loja(
	
-- Criação da coluna ID, indicando que ela só vai aceitar dados do tipo BIGINT(números inteiros até 20 caracteres)
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    
	nome_produto VARCHAR(255),
   
	preco DECIMAL(6,2),
   
	marca VARCHAR(255),
   
	tamanho VARCHAR(255),
   
	cor VARCHAR(255)
   	
);
-- Comando que trás todas os dados da tabela de produtos
	SELECT * FROM tb_loja;

INSERT INTO tb_loja(nome_produto, preco, marca, tamanho, cor)
VALUES ("Dunk", 200.00, "Nike", "40", "Bread")
,("Jordan 3 High", 2500.00, "Nike", "39", "Archaeo Brown")
,("Jordan 1 Mid", 1999.00, "Nike", "38", "Gray");

INSERT INTO tb_loja(nome_produto, preco, marca, tamanho, cor)
VALUES ("Air Force 1 Mid", 800.00, "Nike", "37", "Black"),
("NMD", 799.00, "Adidas", "36", "Black"),
("Ozweego", 699.00, "Adidas", "35", "Verde Militar");

INSERT INTO tb_loja(nome_produto, preco, marca, tamanho, cor)
VALUES ("Stratus", 295.00, "Oakley", "42", "Preto e Vermelho");

SELECT * FROM tb_loja WHERE preco > 500.00;

SELECT * FROM tb_loja WHERE preco < 500.00;

