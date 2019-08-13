
-- Person
insert into person values (1, 'Franta');
insert into person values (2, 'Pepa');

-- Hobby
insert into hobby values (1, 'Běh');
insert into hobby values (2, 'Cyklistika');

-- Person Hobby
insert into person_hobby values (1, 1);


-- Products
insert into product (id, title, price) values  (1, 'produkt1', 13.5);
insert into product (id, title, price) values (2, 'produkt2', 53.1);


-- basket
insert into basket values (1, 1);


-- basket rows
insert into basket_row (id, basket_id, product_id, quantity) values (1, 1, 1, 1);
insert into basket_row (id, basket_id, product_id, quantity) values (2, 1, 2, 2);
