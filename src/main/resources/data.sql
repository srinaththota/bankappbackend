create table Customer(
customerId integer not null,
name varchar(255) not null,
balance double not null,
status boolean
);

insert into Customer values(1001,'Srinath',500,true);
insert into Customer values(1002,'Marie',500,true);
insert into Customer values(1003,'Ebba Thorion',500,true);

create table TransactionDetails(
fromCustomer integer not null,
toCustomer integer not null,
amount double not null
);