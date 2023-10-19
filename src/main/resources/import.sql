insert into category (id,name) values (1,'Comic Books');
insert into category (id,name) values (2,'Movies');
insert into category (id,name) values (3,'Books');

insert into supplier (id, name) values (1,'Marvel');
insert into supplier (id, name) values (2,'DC');

insert into product (id, name, supplier_id, category_id, quantity) VALUES (1, 'Homem Aranha', 1, 1, 100);
insert into product (id, name, supplier_id, category_id, quantity) VALUES (2, 'Super Man', 2, 1, 100);