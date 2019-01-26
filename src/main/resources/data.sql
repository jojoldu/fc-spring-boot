insert into role (name) values ('USER');
insert into role (name) values ('ADMIN');

insert into user (name, email, password, create_date)
values ('jojoldu','jojoldu@gmail.com', '{bcrypt}$2a$10$nYxLuCUrJjolRGbak6JdneyxIHaacSjhIYmrOmsOAfR3mnCXxD7ES', now());

insert into user_roles (user_id, role_id) values (1,1);
insert into user_roles (user_id, role_id) values (1,2);
