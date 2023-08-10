create table ordem(
    id uuid primary key,
    preco numeric,
    tipo varchar2(10),
    created timestamp,
    status varchar2(10),
    user_id uuid,
);