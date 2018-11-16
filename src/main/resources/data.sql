insert into location values (0, 1, 2);
insert into location values (1, 0, 1);

insert into supplier values (0, 'BTM', 'abc@gmail.com', 1234567895, 'ABC');
insert into supplier values (1, 'ECITY', 'def@gmail.com', 1234567895, 'DEF');
insert into supplier values (2, 'HSR', 'ijk@gmail.com', 1234567895, 'IJK');
insert into supplier values (3, 'KRP', 'lmn@gmail.com', 1234567895, 'LMN');
insert into supplier values (4, 'MG', 'opq@gmail.com', 1234567895, 'OPQ');

insert into product values (0, 'A', 'FIVE', 'HSN0', 'Company0', 'ABC-MED');
insert into product values (1, 'B', 'TEN', 'HSN1', 'Company1', 'DEF-MED');
insert into product values (2, 'A', 'FIVE', 'HSN2', 'Company2', 'IJK-MED');
insert into product values (3, 'C', 'FIVE', 'HSN3', 'Company3', 'ABC-MED');
insert into product values (4, 'D', 'TEN', 'HSN4', 'Company4', 'LMN-MED');
insert into product values (5, 'C', 'FIVE', 'HSN5', 'Company5', 'ABC-MED');
insert into product values (6, 'B', 'TEN', 'HSN6', 'Company6', 'DEF-MED');
insert into product values (7, 'D', 'TEN', 'HSN7', 'Company7', 'OPQ-MED');
insert into product values (8, 'D', 'FIVE', 'HSN8', 'Company8', 'RST-MED');
insert into product values (9, 'A', 'FIVE', 'HSN9', 'Company9', 'ABC-MED');

insert into batch values (0, 100, 'BATCH0', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 0);
insert into batch values (1, 100, 'BATCH1', DATE '2018-11-14', DATE '2019-12-15', 31.2, 10, 'PIECE', 3.12, 1, 0);
insert into batch values (2, 100, 'BATCH2', DATE '2019-12-17', DATE '2019-12-15', 25, 5, 'PIECE', 5, 1, 0);
insert into batch values (3, 100, 'BATCH3', DATE '2019-12-17', DATE '2019-12-15', 120, 10, 'PIECE', 12, 1, 0);
insert into batch values (4, 100, 'BATCH4', DATE '2019-12-17', DATE '2019-12-15', 71.2, 10, 'PIECE', 7.12, 0, 0);
insert into batch values (5, 100, 'BATCH5', DATE '2019-12-17', DATE '2019-12-15', 96, 10, 'PIECE', 9.6, 0, 0);

insert into batch values (6, 100, 'BATCH6', DATE '2019-12-17', DATE '2019-12-15', 1.2, 5, 'ML', 1.2, 1, 1);
insert into batch values (7, 100, 'BATCH7', DATE '2018-12-17', DATE '2019-12-15', 12.5, 10, 'ML', 12.5, 0, 1);
insert into batch values (8, 100, 'BATCH8', DATE '2016-12-17', DATE '2019-12-15', 2.6, 5, 'ML', 2.6, 1, 1);
insert into batch values (9, 100, 'BATCH9', DATE '2019-12-17', DATE '2019-12-15', 2, 5, 'ML', 2, 0, 1);
insert into batch values (10, 100, 'BATCH10', DATE '2019-12-17', DATE '2019-12-15', 5, 5, 'ML', 5, 0, 1);
insert into batch values (11, 100, 'BATCH11', DATE '2019-12-17', DATE '2019-12-15', 200, 100, 'ML', 200, 0, 1);

insert into batch values (12, 100, 'BATCH6', DATE '2019-12-17', DATE '2019-12-15', 120, 50, 'GR', 120, 0, 2);
insert into batch values (13, 100, 'BATCH7', DATE '2015-12-17', DATE '2019-12-15', 102, 15, 'GR', 102, 0, 2);
insert into batch values (14, 100, 'BATCH8', DATE '2019-12-17', DATE '2019-12-15', 26, 5, 'GR', 26, 1, 2);
insert into batch values (15, 100, 'BATCH9', DATE '2019-12-17', DATE '2019-12-15', 23, 10, 'GR', 23, 1, 2);
insert into batch values (16, 100, 'BATCH12', DATE '2019-12-17', DATE '2019-12-15', 52, 50, 'GR', 52, 0, 2);
insert into batch values (17, 100, 'BATCH13', DATE '2019-12-17', DATE '2019-12-15', 82, 100, 'GR', 82, 0, 2);

insert into batch values (18, 100, 'BATCH25', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 3);
insert into batch values (19, 100, 'BATCH6', DATE '2016-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 3);
insert into batch values (20, 100, 'BATCH7', DATE '2016-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 3);
insert into batch values (21, 100, 'BATCH8', DATE '2016-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 3);
insert into batch values (22, 100, 'BATCH9', DATE '2016-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 3);
insert into batch values (23, 100, 'BATCH15', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 3);

insert into batch values (24, 100, 'BATCH40', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 4);
insert into batch values (25, 100, 'BATCH50', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 4);
insert into batch values (26, 100, 'BATCH6', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 4);
insert into batch values (27, 100, 'BATCH7', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 4);
insert into batch values (28, 100, 'BATCH8', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 4);
insert into batch values (29, 100, 'BATCH9', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 4);

insert into batch values (30, 100, 'BATCH6', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 5);
insert into batch values (31, 100, 'BATCH7', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 5);
insert into batch values (32, 100, 'BATCH8', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 5);
insert into batch values (33, 100, 'BATCH9', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 5);
insert into batch values (34, 100, 'BATCH0', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 5);

insert into batch values (35, 100, 'BATCH6', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 6);
insert into batch values (36, 100, 'BATCH7', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 6);
insert into batch values (37, 100, 'BATCH8', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 6);
insert into batch values (38, 100, 'BATCH9', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 6);

insert into batch values (39, 100, 'BATCH34', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 7);
insert into batch values (40, 100, 'BATCH35', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 7);

insert into batch values (41, 100, 'BATCH6', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 9);
insert into batch values (42, 100, 'BATCH7', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 9);
insert into batch values (43, 100, 'BATCH8', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 9);
insert into batch values (44, 100, 'BATCH9', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 9);

insert into batch values (45, 100, 'BATCH6', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 8);
insert into batch values (46, 100, 'BATCH58', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 8);
insert into batch values (47, 100, 'BATCH32', DATE '2019-12-17', DATE '2019-12-15', 1.2, 10, 'PIECE', 0.12, 0, 8);

insert into product_supplier values (0, 1);
insert into product_supplier values (1, 0);
insert into product_supplier values (0, 2);
insert into product_supplier values (0, 0);
insert into product_supplier values (2, 0);
insert into product_supplier values (4, 0);
insert into product_supplier values (3, 0);
insert into product_supplier values (2, 1);
insert into product_supplier values (1, 1);
insert into product_supplier values (5, 0);
insert into product_supplier values (6, 0);
insert into product_supplier values (1, 2);
insert into product_supplier values (4, 1);
insert into product_supplier values (8, 0);
insert into product_supplier values (9, 0);
insert into product_supplier values (7, 0);
insert into product_supplier values (2, 2);
insert into product_supplier values (1, 3);
insert into product_supplier values (5, 1);
insert into product_supplier values (7, 1);
insert into product_supplier values (8, 1);
insert into product_supplier values (9, 1);
insert into product_supplier values (1, 4);
insert into product_supplier values (4, 2);
insert into product_supplier values (5, 2);
insert into product_supplier values (3, 1);
insert into product_supplier values (3, 2);
insert into product_supplier values (8, 2);

insert into buyer values (0, 1247853695, 'John');
insert into buyer values (1, 1247855495, 'Doe');

insert into invoice values (0, DATE '2018-11-16', 100, 0);
insert into invoice values (1, DATE '2018-11-14', 110, 1);
insert into invoice values (2, DATE '2018-11-13', 200, 0);
insert into invoice values (3, DATE '2018-11-15', 120, 1);
insert into invoice values (4, DATE '2018-11-12', 140, 1);

insert into invoice_entry values (0, 2, 0, 0, 0);
insert into invoice_entry values (1, 4, 6, 0, 1);

insert into invoice_entry values (2, 3, 15, 1, 2);
insert into invoice_entry values (3, 5, 25, 1, 4);

insert into invoice_entry values (4, 8, 30, 2, 5);
insert into invoice_entry values (5, 4, 12, 2, 2);

insert into invoice_entry values (6, 1, 25, 3, 4);
insert into invoice_entry values (7, 6, 41, 3, 9);

insert into invoice_entry values (8, 3, 36, 4, 6);
insert into invoice_entry values (9, 9, 39, 4, 7);
/*insert into product values (0, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (1, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (2, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (3, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 115.0);
insert into product values (4, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (5, '2332', 'A', 139.82, DATE '2019-12-18', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 120.0);
insert into product values (6, '2332', 'A', 139.82, DATE '2020-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (7, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (8, '2332', 'A', 139.82, DATE '2017-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (9, '2332', 'A', 139.82, DATE '2018-11-02', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (10, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', 'BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (11, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (12, '2332', 'A', 139.82, DATE '2025-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (13, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 120.0);
insert into product values (14, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (15, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (16, '2332', 'A', 139.82, DATE '2020-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (17, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', 'AAAAAAA PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (18, '2332', 'A', 139.82, DATE '2019-10-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (19, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (20, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (21, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 195.0);
insert into product values (22, '2332', 'A', 139.82, DATE '2019-05-17', 'XXXX', 'ZZZZZZ PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (23, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (24, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (25, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (26, '2332', 'A', 139.82, DATE '2015-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 185.0);
insert into product values (27, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (28, '2332', 'A', 139.82, DATE '2018-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (29, '2332', 'A', 139.82, DATE '2016-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);
insert into product values (30, '2332', 'A', 139.82, DATE '2019-12-17', 'XXXX', '8BALAJI PHARMACETICALS', 'A CN GEL', 2, 145.0);*/