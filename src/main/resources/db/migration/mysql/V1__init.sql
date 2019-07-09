

CREATE TABLE `empresa` (
`id` bigint ( 20 ) NOT NULL ,
`razao_social` varchar ( 255 ) NOT NULL,
`cnpj` varchar ( 255 ) NOT NULL ,
`data_criacao` datetime NOT NULL ,
`data_atualizacao` datetime NOT NULL 
) ENGINE = InnoDB DEFAULT CHARSET = utf8;


CREATE TABLE `cliente` (
`id` bigint ( 20 ) NOT NULL ,
`codigo` varchar ( 255 ) NOT NULL,
`nome` varchar ( 255 ) NOT NULL ,
`regiao` varchar ( 255 ) NOT NULL ,
`email` varchar ( 255 ) NOT NULL ,
`cnpj` varchar ( 255 ) NOT NULL ,
`perfil` varchar ( 255 ) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

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


CREATE TABLE `produto` (
`codigo` varchar ( 255 ) NOT NULL,
`descricao` varchar ( 255 ) NOT NULL ,
`data_criacao` datetime NOT NULL ,
`data_atualizacao` datetime NOT NULL 
) ENGINE = InnoDB DEFAULT CHARSET = utf8;


CREATE TABLE `usuario` (
`id` bigint ( 20 ) NOT NULL ,
`email` varchar ( 255 ) NOT NULL,
`senha` varchar ( 255 ) NOT NULL ,
`perfil` varchar ( 255 ) NOT NULL 
) ENGINE = InnoDB DEFAULT CHARSET = utf8;


ALTER TABLE `empresa`
ADD PRIMARY KEY ( `id`);
ALTER TABLE `empresa`
MODIFY `id` bigint ( 20 ) NOT NULL AUTO_INCREMENT;


ALTER TABLE `cliente`
ADD PRIMARY KEY ( `id`);
ALTER TABLE `cliente`
MODIFY `id` bigint ( 20 ) NOT NULL AUTO_INCREMENT;


ALTER TABLE `ocorrencia`
ADD PRIMARY KEY ( `id`);
ALTER TABLE `ocorrencia`
MODIFY `id` bigint ( 20 ) NOT NULL AUTO_INCREMENT;

ALTER TABLE `produto`
ADD PRIMARY KEY ( `codigo`);

ALTER TABLE `usuario`
ADD PRIMARY KEY ( `id`);
ALTER TABLE `usuario`
MODIFY `id` bigint ( 20 ) NOT NULL AUTO_INCREMENT;



