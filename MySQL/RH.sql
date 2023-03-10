CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_colaboradores(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255),
matricula BIGINT,
cargo VARCHAR(255),
salario DECIMAL(7,2)
);

INSERT INTO tb_colaboradores (nome, matricula, cargo, salario) VALUES("PATRICIA", 67890, "ESTAGIÁRIA", 1600),
("Jonas", 322845, "Trainee", 2500),
("Lucas", 42583, "Desenvolvedor JR", 4000), 
("Julia", 4321, "DESENVOLVEDORA PLENO", 8000);

INSERT INTO tb_colaboradores (nome, matricula, cargo, salario) VALUES("ROBERTA", 39550, "DESENVOLVEDORA SENIOR", 9999);

SELECT * FROM tb_colaboradores;

SELECT * FROM tb_colaboradores WHERE salario > 2000;

SELECT * FROM tb_colaboradores WHERE salario < 2000;

UPDATE tb_colaboradores SET salario = 14000 WHERE id = 5;


UPDATE tb_colaboradores SET nome = "MONICA" WHERE id = 4;