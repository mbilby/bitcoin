create table usuario(
    id uuid primary key,
    nome varchar(50),
    cpf varchar(14),
    username varchar(50),
	password varchar(10),
	role varchar(10),
    created timestamp,
	changed timestamp
);