INSERT INTO tb_product (name, price, score, image) VALUES ('Call Of Duty Infinite Warfare', 49.99, 80, 'call-of-duty-infinite-warfare.png');     
INSERT INTO tb_product (name, price, score, image) VALUES ('Super Mario Odyssey', 197.88, 100, 'super-mario-odyssey.png');
INSERT INTO tb_product (name, price, score, image) VALUES ('The Witcher III Wild Hunt', 119.5, 250, 'the-witcher-iii-wild-hunt.png');
INSERT INTO tb_product (name, price, score, image) VALUES ('Call Of Duty WWII', 249.99, 205, 'call-of-duty-wwii.png');
INSERT INTO tb_product (name, price, score, image) VALUES ('Mortal Kombat XL', 69.99, 150, 'mortal-kombat-xl.png');
INSERT INTO tb_product (name, price, score, image) VALUES ('Shards of Darkness', 71.94, 400, 'shards-of-darkness.png');
INSERT INTO tb_product (name, price, score, image) VALUES ('Terra Média: Sombras de Mordor', 49.99, 80, 'terra-media-sombras-de-mordor.png');
INSERT INTO tb_product (name, price, score, image) VALUES ('FIFA 22', 195.39, 325, 'fifa-22.png');
INSERT INTO tb_product (name, price, score, image) VALUES ('Horizon Zero Dawn', 115.8, 290, 'horizon-zero-dawn.png');
INSERT INTO tb_product (name, price, score, image) VALUES ('NBA 2k22', 300.00, 300, 'nbk2k22.png');



INSERT INTO tb_order (price, quantity) VALUES (0, 20);

INSERT INTO tb_order_product (order_id, product_id) VALUES (1,1);
INSERT INTO tb_order_product (order_id, product_id) VALUES (1,2);
INSERT INTO tb_order_product (order_id, product_id) VALUES (1,2);