CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;


CREATE TABLE tb_categoria(
	id_cat INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(90) NOT NULL,
    tipo VARCHAR (90) NOT NULL,
    descricao VARCHAR (90),
    PRIMARY KEY (id_cat)
);


CREATE TABLE tb_produto(
	id_produto INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR (90) NOT NULL,
    preco FLOAT NOT NULL,
	descricao VARCHAR (255),
    ativo BOOLEAN DEFAULT TRUE,
    peso FLOAT,
	fk_cat int NOT NULL,
    FOREIGN KEY (fk_cat) REFERENCES tb_categoria(id_cat),
    PRIMARY KEY (id_produto)
);

INSERT INTO tb_categoria(nome, tipo,descricao)
VALUES ("medicamentos","medicamento","jhjhkhklkh"),
("perfumaria","perfume", "kjljjlljlj"),
("alimenticios","alimento","lkjkjkjkljl"),
("controlados","controlado","kljkjkljl"),
("tarjados","tarjado","khhkllhkhklh");


INSERT INTO tb_produto(nome, preco,descricao, peso,fk_cat)
VALUES ("corisa",13.51,"jhjhkhklkh",50,1),
("rexona",12.55, "kjljjlljlj",100,2),
("cereal",15.22,"lkjkjkjkljl",200,3),
("tre",100.00,"kljkjkljl",300,4),
("pasta colgate",5.00,"khhkllhkhklh",150,2);

INSERT INTO tb_produto(nome, preco,descricao, peso,fk_cat)
VALUES ("bass",13.51,"jhjhkhklkh",50,5);

SELECT * FROM tb_produto WHERE preco > 50;

SELECT * FROM tb_produto WHERE preco > 3 and preco < 60;

SELECT nome FROM tb_produto WHERE nome LIKE "b%";

SELECT preco, ativo, fk_cat from tb_produto
INNER JOIN tb_categoria ON tb_categoria.id_cat = tb_produto.fk_cat;


