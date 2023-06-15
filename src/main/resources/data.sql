INSERT INTO public.CUSTOMERS (name, surname, age, phone_number)
VALUES
    ('Пётр', 'Сидоров', 21, '+79999999999'),
    ('Сидор', 'Петров', 27, '+77777777777'),
    ('Артём', 'Коновалов', 23, '+77777777771'),
    ('Лукерья', 'Шапошникова', 71, '+77777777772'),
    ('Семён', 'Кац', 32, '+77777777773'),
    ('Елизавета', 'Котова', 25, '+77777777774'),
    ('Марина', 'Алышева', 34, '+77777777775');

insert into ORDERS (date, customer_id, product_name, amount)
VALUES
    ('2023-05-01', 7, 'Чашка', '130'),
    ('2023-05-10', 2, 'Чайник', '1700'),
    ('2023-05-20', 3, 'Блюдце', '150'),
    ('2023-08-21', 6, 'Чай', '220'),
    ('2023-05-23', 5, 'Кофе', '370'),
    ('2023-05-25', 6, 'Сахар', '70'),
    ('2023-05-27', 1, 'Самовар', '5370');


