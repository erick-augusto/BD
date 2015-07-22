create database trabalho;
use trabalho;

create table aluno(
ra_aluno decimal(8),
nome_aluno text,
-- password_aluno varchar(50),              password de login
primary key(ra_aluno));

insert into aluno (ra_aluno, nome_aluno) values (
11111111,'Erick');
insert into aluno (ra_aluno, nome_aluno) values (
22222222,'Bob');
select  * from aluno;

create table docente(
siape_docente decimal(6),
nome_docente char(40),
-- password_docente varchar(50),           password de login
primary key(siape_docente));
insert into docente (siape_docente,nome_docente) values (
111111,'Bob Sponja');

create table disciplina(
cod_disciplina char(6),
nome_disciplina char(50),
t integer,
p integer,
i integer,
primary key(cod_disciplina));

create table coordenador(
siape_coordenador decimal(6),
foreign key(siape_coordenador) references docente(siape_docente));
insert into coordenador (siape_coordenador) values (
111111);

create table turma(
id_turma integer,
cod_turma char(8),
cod_disciplina char(6),
-- nome_disciplina char(50),
vagas integer,
primary key(id_turma),
foreign key(cod_disciplina) references disciplina(cod_disciplina));
-- foreign key(nome_disciplina) references disciplina(nome_disciplina));

create table aula(
id_aula integer,
dia text,
hini text,
hfim text,
sala text,
-- nome_docente char(40),
id_turma integer,
primary key(id_aula),
-- foreign key(nome_docente) references docente(nome_docente),
foreign key(id_turma) references turma(id_turma));

create table deferidos(
ra_aluno decimal(8),
-- nome_disciplina char(50),
cod_turma integer,
n_matricula integer,
foreign key(ra_aluno) references aluno(ra_aluno),
-- foreign key(nome_disciplina) references disciplina(nome_disciplina),
foreign key(cod_turma) references turma(id_turma));



