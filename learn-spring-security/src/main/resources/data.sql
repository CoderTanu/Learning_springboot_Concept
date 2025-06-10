insert into customers (name, contact_name, email, phone) value('Acme', 'Wylie Coyote, wcoyto@gmai.com', 74974340945);
insert into customers (name, contact_name, email, phone) value('Spacely', 'Geogre jettern, jet@gmai.com', 89974340945);
insert into customers (name, contact_name, email, phone) value('Callahn', 'thomas, thomas@gmai.com', 12374340945);
insert into customers (name, contact_name, email, phone) value('dundler', 'michael, micheldj@gmai.com', 78974340945);
insert into customers (name, contact_name, email, phone) value('Intitech', 'Peter, pettero@gmai.com', 76774340945);
insert into customers (name, contact_name, email, phone) value('Wayne', 'Bruce, brucehcjghd@gmai.com', 78074340945);




insert into orders (customer_id, order_info) value((Select  customer_id FROM customers where name ='Acme'), "fjdvgufhv" );
insert into orders (customer_id, order_info) value((Select  customer_id FROM customers where name ='Acme'),"dfghfj");
insert into orders (customer_id, order_info) value((Select  customer_id FROM customers where name ='Acme'), "dhgsvjs");


INSERT INTO users(username, password, enabled) values('user', 'password', true);
INSERT INTO users(username, password, enabled) values('admin', 'password', true);

INSERT INTO authorities(username, authority) values('user', 'ROLE_USER');
INSERT INTO authorities(username, authority) values('admin', 'ROLE_USER');
INSERT INTO authorities(username, authority) values('admin', 'ROLE_ADMIN');