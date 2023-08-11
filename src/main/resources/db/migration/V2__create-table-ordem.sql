create table ordem(
    id uuid primary key,
    preco decimal(6,2),
    tipo varchar(10),
    created timestamp,
    status varchar(10),
    user_id uuid,
    foreign key(user_id) references usuario(id)
);