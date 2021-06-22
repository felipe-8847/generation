CREATE DATABASE db_cidade_das_frutas;

USE db_cidade_das_frutas;

CREATE TABLE tb_categoria(
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(80) NOT NULL,
    tipo VARCHAR(80) NOT NULL,
    desconto INT,
    PRIMARY KEY (id)
);

CREATE TABLE tb_produto (
	id_p INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(80) NOT NULL,
    descricao VARCHAR(80) NOT NULL,
    preco FLOAT NOT NULL,
    peso int,
    ativo BOOLEAN DEFAULT TRUE,
    fk_cat INT NOT NULL,
    FOREIGN KEY (fk_cat) REFERENCES tb_categoria(id),
    PRIMARY KEY (id_p)
);