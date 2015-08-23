CREATE DATABASE `master_pizza` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `master_pizza`;

CREATE TABLE `categoria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `telefone` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `produto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `preco` varchar(45) DEFAULT NULL,
  `categoria_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_categoria_idx` (`categoria_id`),
  CONSTRAINT `id_categoria` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `endereco` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cliente_id` int(11) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `cliente_id_idx` (`cliente_id`),
  CONSTRAINT `cliente_id` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `funcionario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permissao` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `moto_placa` varchar(45) DEFAULT NULL,
  `ramal` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `ingrediente` (
  `id` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pagamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `valor` decimal(10,2) DEFAULT NULL,
  `desconto` decimal(10,2) DEFAULT NULL,
  `taxa_entrega` decimal(10,2) DEFAULT NULL,
  `forma_pagamento` int(11) DEFAULT NULL,
  `troco` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pedido` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `entrega` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_entregador` int(11) DEFAULT NULL,
  `id_atendente` int(11) NOT NULL,
  `id_endereco` int(11) DEFAULT NULL,
  `id_pagamento` int(11) DEFAULT NULL,
  `data_hora` varchar(45) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cliente_idx` (`id_cliente`),
  KEY `id_endereco_idx` (`id_endereco`),
  KEY `id_pagamento_idx` (`id_pagamento`),
  KEY `id_atendente_idx` (`id_atendente`),
  KEY `id_entregador_idx` (`id_entregador`),
  CONSTRAINT `id_atendente` FOREIGN KEY (`id_atendente`) REFERENCES `funcionario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_endereco` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_entregador` FOREIGN KEY (`id_entregador`) REFERENCES `funcionario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_pagamento` FOREIGN KEY (`id_pagamento`) REFERENCES `pagamento` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pedido_produto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_produto` int(11) DEFAULT NULL,
  `id_pedido` int(11) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_produto_idx` (`id_produto`),
  KEY `id_pedido2_idx` (`id_pedido`),
  CONSTRAINT `id_pedido2` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_produto2` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `produto_ingrediente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_produto` int(11) NOT NULL,
  `id_ingrediente` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_produto_idx` (`id_produto`),
  KEY `id_ingrediente_idx` (`id_ingrediente`),
  CONSTRAINT `id_ingrediente` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingrediente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_produto` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
