insert into role (name) values ('USER');
insert into role (name) values ('ADMIN');

insert into user (name, email, password, create_date)
values ('jojoldu','jojoldu@gmail.com', '1234', now());

insert into user_roles (user_id, role_id) values (1,1);
insert into user_roles (user_id, role_id) values (1,2);
