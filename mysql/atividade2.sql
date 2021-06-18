create database ecommerce;

use ecommerce;

create table tb_produto(
	id bigint auto_increment,
    nome varchar(60) not null,
    preco double not null,
    descricao varchar(200) not null,
    ativo boolean not null,
    quantidade int not null,
    primary key (id)
)

insert into tb_produto(nome, preco, descricao, ativo,quantidade) values ("celular",3000,"smartfone",true,40); 
insert into tb_produto(nome, preco, descricao, ativo,quantidade) values ("tv",4000,"televisão",true,75); 
insert into tb_produto(nome, preco, descricao, ativo,quantidade) values ("som",2000,"caixa de som",true,100); 
insert into tb_produto(nome, preco, descricao, ativo,quantidade) values ("geladeira",4500,"geladeira master ",false,0); 
insert into tb_produto(nome, preco, descricao, ativo,quantidade) values ("bateria",200,"bateria para moto ou carro",true,400); 

select * from tb_produto where preco > 3000;
select * from tb_produto where preco < 3000;

update tb_produto set preco = 9000 where id= 3;
