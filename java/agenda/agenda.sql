CREATE SCHEMA `agenda` DEFAULT CHARACTER SET utf8 ;
use agenda;

CREATE TABLE contatos(
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(60) NOT NULL COMMENT 'nome',
telefone VARCHAR(20) NOT NULL COMMENT 'telefone',
observacao TEXT
);

ALTER TABLE contatos
modify id int unsigned not null 
auto_increment comment 'chave primária', auto_increment = 001; 
commit;

INSERT INTO contatos (nome, telefone, observacao) VALUES
('Ana Alves', '61987650001', 'Professora'),
('Bruno Bolacchi', '61987650002'),
('Cris Campos', '61987650003', 'Estudante');