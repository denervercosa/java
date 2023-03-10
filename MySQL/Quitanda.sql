-- comando para criação de banco de dados
CREATE DATABASE db_quitanda;

-- comando que indica ao mysql workbench o banco de dados que estou trabalhando
USE db_quitanda;

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome_produto VARCHAR(255),
    preco DECIMAL(6,2),
  
	PRIMARY KEY(id)
);

-- Seleciona todos os dados da tabela produtos
SELECT * FROM tb_produtos;

INSERT INTO tb_produtos(nome_produto, preco) VALUES ("Maçã", 3.00);
INSERT INTO tb_produtos(nome_produto, preco) VALUES ("Banana", 1.50);
INSERT INTO tb_produtos(nome_produto, preco) VALUES ("Morango", 5.00);
INSERT INTO tb_produtos(nome_produto, preco) VALUES ("Laranja", 2.00);

-- desativa o modo seguro do mysql e permite update e delete
SET SQL_SAFE_UPDATES = 0;

-- atualização de um dado dentro da minha tabela
UPDATE tb_produtos SET preco = 7.90 WHERE id=2;