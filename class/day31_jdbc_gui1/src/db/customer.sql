select * from customer;

create table customer (
    code number(4) PRIMARY KEY,
    name VARCHAR2(30) not null,
    email varchar2(30),
    phone varchar2(20)
)

-- create sequece