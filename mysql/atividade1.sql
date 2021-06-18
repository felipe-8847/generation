insert into tb_funcionarios(nome, funcao, idade, salario,ativo) values ("felipe","dev",27,5000,true); 
insert into tb_funcionarios(nome, funcao, idade, salario,ativo) values ("seila","dev2",99,3000,false); 
insert into tb_funcionarios(nome, funcao, idade, salario,ativo) values ("olhalá","dev3",88,9000,true); 
insert into tb_funcionarios(nome, funcao, idade, salario,ativo) values ("aki","dev3",54,2500,true); 
insert into tb_funcionarios(nome, funcao, idade, salario,ativo) values ("jáFoi","dev2",15,2900,true);

select * from tb_funcionarios where salario > 3000;
select * from tb_funcionarios where salario < 3000;

update tb_funcionarios set nome = "Felipe alves" where id= 1;