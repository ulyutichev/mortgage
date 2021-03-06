create sequence hibernate_sequence
    start with 1
    increment by 1;

create table client (
    id integer not null,
    name varchar(255),
    passport_data varchar(10),
    primary key (id)
);

create table credit (
    id integer not null,
    credit_amount bigint not null,
    credit_rate double not null check (credit_rate>=0),
    object_of_credit varchar(255),
    total_amount bigint not null,
    years integer not null check (years<=50 AND years>=1),
    client_id integer,
    seller_id integer,
    primary key (id)
);

create table seller (
    id integer not null,
    name varchar(255),
    personal_data varchar(10),
    seller_type varchar(255) default 'SALESMAN',
    primary key (id)
);

alter table credit
    add constraint fromCreditToClient
    foreign key (client_id)
    references client;

alter table credit
    add constraint fromCreditToSeller
    foreign key (seller_id)
    references seller;