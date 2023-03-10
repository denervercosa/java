CREATE DATABASE db_registro_escola;

USE db_registro_escola;

CREATE TABLE tb_estudantes(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    nota DECIMAL(4,2),
    turma VARCHAR(255),
    periodo VARCHAR(255)
);

INSERT INTO tb_estudantes (nome, nota, turma, periodo)
VALUES ("BRUNA", 9.0, "9°ANO", "TARDE"),
("JENNIFER", 8.0, "9º ANO", "TARDE"),
("JESSICA", 10.0, "9º ANO", "TARDE"),
("DOUGLAS", 8.0, "9º ANO", "TARDE"),
("KAIQUE", 9.0, "9º ANO", "TARDE"),
("THEO", 9.5, "9º ANO", "TARDE"),
("ENZO", 8.5, "9º ANO", "TARDE"),
("VALENTINA", 8.0, "9º ANO", "TARDE");

SELECT * FROM tb_estudantes;

SELECT * FROM tb_estudantes WHERE nota > 7.0;

SELECT * FROM tb_estudantes WHERE nota < 7.0;

UPDATE tb_estudantes SET nota = 10.0 WHERE id = 5;

UPDATE tb_estudantes SET nota = 9.0, periodo = "NOITE" WHERE id = 1;