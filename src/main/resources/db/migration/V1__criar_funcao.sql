CREATE TABLE PUBLIC.funcao (

     id INT PRIMARY KEY NOT NULL,
     cargo VARCHAR(255) NOT NULL,
     salario DECIMAL NOT NULL,
     adicional_anual DECIMAL NOT NULL,
     beneficio INT DEFAULT 0

);

INSERT INTO funcao VALUES(1, 'Secretário', 7000, 1000, 20);
INSERT INTO funcao VALUES(2, 'Vendedor', 12000, 1800, 30);
INSERT INTO funcao VALUES(3, 'Gerente', 20000, 3000, 0);