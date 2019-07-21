CREATE TABLE `empresa` (
`id` bigint ( 20 ) NOT NULL ,
`razao_social` varchar ( 255 ) NOT NULL,
`cnpj` varchar ( 255 ) NOT NULL ,
`data_criacao` datetime NOT NULL ,
`data_atualizacao` datetime NOT NULL 
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

ALTER TABLE `empresa`
ADD PRIMARY KEY ( `id`);
ALTER TABLE `empresa`
MODIFY `id` bigint ( 20 ) NOT NULL AUTO_INCREMENT;

INSERT INTO `empresa` (`id`,`razao_social`,`cnpj`,`data_criacao`,`data_atualizacao`)
VALUES ( NULL , 'Empresa ADMIN', '82198127000121' , CURRENT_DATE(), CURRENT_DATE());

 

CREATE TABLE `cliente` (
`id` bigint ( 20 ) NOT NULL ,
`codigo` varchar ( 255 ) NOT NULL,
`nome` varchar ( 255 ) NOT NULL ,
`regiao` varchar ( 255 ) NOT NULL ,
`email` varchar ( 255 ) NOT NULL ,
`cnpj` varchar ( 255 ) NOT NULL ,
`perfil` varchar ( 255 ) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

ALTER TABLE `cliente`
ADD PRIMARY KEY ( `id`);
ALTER TABLE `cliente`
MODIFY `id` bigint ( 20 ) NOT NULL AUTO_INCREMENT;

INSERT INTO `cliente` (`id`,`codigo`,`nome`,`regiao`,`email`,`cnpj`,`perfil`)
VALUES ( NULL , '001', 'Fabiano Fazenda' , 'SP', 'fvidoto@gmail.com', '31871479843','ROLE_USUARIO');



CREATE TABLE `usuario` (
`id` bigint ( 20 ) NOT NULL ,
`email` varchar ( 255 ) NOT NULL,
`senha` varchar ( 255 ) NOT NULL ,
`perfil` varchar ( 255 ) NOT NULL 
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

ALTER TABLE `usuario`
ADD PRIMARY KEY ( `id`);
ALTER TABLE `usuario`
MODIFY `id` bigint ( 20 ) NOT NULL AUTO_INCREMENT;

INSERT INTO `usuario` (`id`,`email`,`senha`,`perfil`)
VALUES ( NULL , 'fvidoto@gmail.com', '12345678' , 'ROLE_ADMIN');



CREATE TABLE `ocorrencia` (
`id` bigint ( 20 ) NOT NULL ,
`data` datetime NOT NULL ,
`tp_ocorrencia` varchar ( 255 ) NOT NULL,
`descricao` varchar ( 255 ) NOT NULL ,
`localizacao` varchar ( 255 ) NOT NULL ,
`usuario` varchar ( 255 ) NOT NULL ,
`data_criacao` datetime NOT NULL ,
`data_atualizacao` datetime NOT NULL 
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

ALTER TABLE `ocorrencia`
ADD PRIMARY KEY ( `id`);
ALTER TABLE `ocorrencia`
MODIFY `id` bigint ( 20 ) NOT NULL AUTO_INCREMENT;

INSERT INTO `ocorrencia` (`id`,`data`,`tp_ocorrencia`,`descricao`,`localizacao`,`usuario`,`data_criacao`,`data_atualizacao`)
VALUES ( NULL , CURRENT_DATE(), 'PROBLEMA' , 'O EIXO QUEBROU', '-15,30', 'FVIDOTO', CURRENT_DATE() , CURRENT_DATE());



CREATE TABLE `produto` (
`id` bigint ( 20 ) NOT NULL ,
`codigo` varchar ( 255 ) NOT NULL,
`descricao` varchar ( 255 ) NOT NULL ,
`data_criacao` datetime NOT NULL ,
`data_atualizacao` datetime NOT NULL 
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

ALTER TABLE `produto`
ADD PRIMARY KEY ( `id`);
ALTER TABLE `produto`
MODIFY `id` bigint ( 20 ) NOT NULL AUTO_INCREMENT;

INSERT INTO `produto` (`id`, `codigo`,`descricao`,`data_criacao`,`data_atualizacao`)
VALUES ( NULL, '0101010001' , 'ARADO FIXO', CURRENT_DATE() , CURRENT_DATE());


