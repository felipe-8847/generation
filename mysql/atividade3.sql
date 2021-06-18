create database escola;

create table tb_estudantes(
	id bigint auto_increment,
    nome varchar(50) not null,
    codigo int (3) not null,
    ano varchar(60) not null,
    nota float not null,
    matriculado boolean,
    primary key (idtb_estudantes)
    )
    
insert into tb_estudantes(nome, codigo, ano, nota,matriculado) values ("felipe",1,"3 ano",8.5,true); 
insert into tb_estudantes(nome, codigo, ano, nota,matriculado) values ("teste1",2,"3 ano",8.0,true); 
insert into tb_estudantes(nome, codigo, ano, nota,matriculado) values ("4444",3,"3 ano",8.5,true); 
insert into tb_estudantes(nome, codigo, ano, nota,matriculado) values ("fe55555lipe",4,"3 ano",10.0,true); 
insert into tb_estudantes(nome, codigo, ano, nota,matriculado) values ("88888",5,"3 ano",3.5,true); 
insert into tb_estudantes(nome, codigo, ano, nota,matriculado) values ("99999",6,"3 ano",7.5,true); 
insert into tb_estudantes(nome, codigo, ano, nota,matriculado) values ("teste123",7,"3 ano",5.5,true); 
insert into tb_estudantes(nome, codigo, ano, nota,matriculado) values ("123teste",8,"3 ano",9.5,true); 

select * from tb_estudantes where nota > 8.0;
select * from tb_estudantes where nota < 8.0;


update tb_estudantes set nome = "Felipe alves" where id= 3;
