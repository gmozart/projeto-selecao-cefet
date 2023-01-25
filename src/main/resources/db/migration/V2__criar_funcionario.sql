CREATE TABLE PUBLIC.funcionario (

     id INT PRIMARY KEY NOT NULL,
     funcao_id INT NOT NULL,
     nome VARCHAR(255) NOT NULL,
     data_contratacao DATE NOT NULL,
     FOREIGN KEY (funcao_id) REFERENCES funcao(id)
);

INSERT INTO funcionario VALUES(1, 1, 'Jorge Carvalho', '01-08-2018');
INSERT INTO funcionario VALUES(2, 1, 'Maria Souza ', '01-12-2015');
INSERT INTO funcionario VALUES(3, 2, 'Ana Silva ', '01-12-2021');
INSERT INTO funcionario VALUES(4, 2, 'João Mendes' ,'01-12-2021');
INSERT INTO funcionario VALUES(5, 3, 'Juliana Alves ','01-07-2017');
INSERT INTO funcionario VALUES(6, 3, 'Ana Silva ', '01-03-2014');