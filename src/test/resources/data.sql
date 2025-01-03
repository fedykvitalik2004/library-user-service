insert into users(id, first_name, last_name, email, password, birthday)
values (1, 'Jane', 'Doe', 'jane_doe@email.com', 'Password', '1998-11-12');
alter table users alter COLUMN id RESTART with 2;