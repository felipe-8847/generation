CREATE DATABASE db_pizza_legal;

USE db_pizza_legal;

CREATE TABLE tb_categorias (
	id_categoria INT NOT NULL AUTO_INCREMENT,
    tipo VARCHAR(80) NOT NULL,
    tamanho VARCHAR (50) NOT NULL,
    entrega BOOLEAN DEFAULT TRUE,
	PRIMARY KEY (id_categoria)
);


CREATE TABLE tb_pizza (
	id_pizza INT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(100) NOT NULL,
    sabor VARCHAR (90) NOT NULL,
    recheio_borda VARCHAR (50) DEFAULT "SEM RECHEIO",
    complemento VARCHAR (80),
    preco FLOAT NOT NULL,
    fk_cat int NOT NULL,
    FOREIGN KEY (fk_cat) REFERENCES tb_categorias (id_categoria),
    PRIMARY KEY (id_pizza)
);

INSERT INTO tb_categorias (tipo,tamanho) 
VALUES ("Doçe","Grande"),("Doçe","Pequena"),
("Salgada","Grande"),
("Salgada","Pequena"),
("Artesanal","Grande");

INSERT  INTO tb_pizza (nome,sabor,complemento,preco,fk_cat)
VALUES("frango1","frango","catupiry",50,3),
("queijo2","queijo","catupiry",40,3),
("marguerita6","tomate, queijo","catupiry",65,3),
("pizza5","queijo e oregano","catupiry",55,3),
("chocolate3","chok","catupiry",77,2),
("maça4","maça","catupiry",45,1),
("Artesanal","sushi","catupiry",63,5),
("Artesanal","especial","catupiry",80,5);


SELECT * FROM tb_pizza WHERE preco > 45;

SELECT preco FROM tb_pizza WHERE preco > 29 AND preco < 60;

SELECT nome FROM tb_pizza WHERE nome LIKE "%c%";


SELECT nome, preco, fk_cat FROM tb_pizza
INNER JOIN tb_categorias ON tb_categorias.id_categoria = tb_pizza.fk_cat;


SELECT nome, sabor, complemento, preco FROM tb_pizza
INNER JOIN  tb_categorias WHERE tb_pizza.fk_cat = 3;



