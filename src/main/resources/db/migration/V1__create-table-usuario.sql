create table transacao(
    id uuid primary key,
    nome varchar2(50),
    cpf varchar2(14),
    username varchar2(50),
	password varchar2(10),
    created timestamp,
	changed timestamp
);