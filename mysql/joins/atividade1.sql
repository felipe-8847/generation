CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe (
	id_c INT AUTO_INCREMENT,
    tipo VARCHAR (255) NOT NULL,
    classificacao INT NOT NULL,
    ano int (4),
    PRIMARY KEY (id_c)
);


CREATE TABLE tb_personagens (
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR (255) NOT NULL,
    ataque 	INT NOT NULL,
    defesa INT NOT NULL,
    secreto INT NOT NULL,
    bonus_poder INT NOT NULL,
    fk_c int,
	FOREIGN KEY (fk_c) REFERENCES tb_classe(id_c),
    PRIMARY KEY (id)
);

INSERT INTO tb_classe (tipo, classificacao, ano)
 VALUES 
("Aventura",12,1999),
("acão",16,2000),
("RPG",15,2006),
("Esportes",16,2012),
("Terror",18,2021);


INSERT INTO tb_personagens(nome, ataque, defesa,secreto,bonus_poder)
VALUES ("goll",10000,9000,50000,5000,2),
("teste",9000,4000,3000,100,2),
("malibu kame",1000,500,300,200,3),
("seker",5000,6000,8000,4000,2),
("buuu",4000,5000,1000,822,2),
("hagnarok",5000,6000,8000,7000,2),
("gothem",11000,9000,8000,9000,3),
("pooo",5000,6000,8000,1000,2);


SELECT * FROM tb_personagens WHERE ataque > 2000;

SELECT * FROM tb_personagens WHERE defesa < 6000 and defesa > 1000;

SELECT nome FROM tb_personagens WHERE nome LIKE "%c%";

SELECT nome, ataque, defesa, fk_c from tb_personagens
	INNER JOIN tb_classe ON tb_classe.id_c = tb_personagens.fk_c;


