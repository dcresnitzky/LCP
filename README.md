# LCP NOTURNO 
Projeto de Pizzaria 
UNESP RIO CLARO 

Equipe: 

Daniel Resnitzky; 

Joab Nunes; 

Guilherme Costa; 

Guilherme Livramento 


Sumário 

1. Introdução 
2. Visão Geral 
3. Requisitos do sistema 
4. Estrutura 
  1. - UML 
  2. - Principais Classes e métodos. 
  3. - Views 
5. Código Fonte 
6. Bibliografia 

1) Introdução 

  Esse é o documento que expõe o sistema desenvolvido pelo grupo para a matéria de Linguagens Comerciais de Programação do curso de Ciências da Computação, período noturno, UNESP - Rio Claro . 
  
  O projeto foi desenvolvido em JAVA utilizando o paradigma de orientação objeto. Para isso empregamos conceitos como herança, encapsulamento, interfaces entre outros. Esses conceitos fizeram parte do conteúdo ministrado em sala de aula ou foram adquiridos pelos alunos no ambiente de trabalho e por simples experimentação. 
  
  Nesta primeira etapa do desenvolvimento iremos apresentar um diagrama de classes baseado em UML, uma breve explicação das funcionalidades, parte de seu código fonte e imagens de suas views. 

2) Visão Geral 
  Para a modelagem e desenvolvimento foram usados os  seguintes softwares: ASTAH Community 7.0 para o UML e o ambiente de desenvolvimento integrado JAVA foi o NETBEANS 8.02. 
  
  O sistema é desenvolvido para uma pizzaria mas abstrai qualquer estabelecimento comercial que permite ao cliente fazer pedidos e somente retirar ou pedir que seu pedido seja entregue em sua residência. 
O sistema apresenta views práticas e objetivas e uma ágil função de busca para clientes já cadastrados desobrigando o cliente a passar o endereço todas as vezes que realizar um pedido. Foi implementado um sólido sistema de gerenciamento de produtos e funcionários e um breve organizador de entregas de acordo com a disponibilidade de cada entregador. 


3) Requisitos 

1. O sistema ira permitir ao cliente fazer um pedido pessoalmente ou pelo telefone. 
  1. Um atendente irá registrar/buscar o cliente pela interface. 
    1. Se o pedido for para entrega o cliente deverá fornecer um endereço caso não tenha cadastro prévio. 
    2. O atendente irá inserir os produtos pedidos e suas quantidades. 
    3. Um entregador será selecionado para realizar a entrega. 
    4. O atendente então deverá perguntar pela forma de pagamento e se for em dinheiro o cliente de informar para quanto precisa de troco. 
    5. Após finalizar o pedido o produto entrara na fila para o preparo. 
2. O sistema irá permitir ao atendente exibir o cardápio organizado por categorias sempre que solicitado. 
3. O sistema irá permitir ao atendente acompanhar o pedido pelo sistema. 
4. O sistema irá permitir ao atendente mudar os status dos pedidos para: na fila, preparo, entrega, entregue, cancelado. 
5. O sistema irá permitir ao gerente criar/editar/remover produtos e seus respectivos ingredientes assim como as categorias de cada um. 
6. O sistema irá permitir listar/cadastrar/editar/remover clientes. 
7. O sistema irá permitir listar a todos os produtos. 
8. Ao gerente, listar/cadastrar/editar/remover funcionários. 

4) Estrutura 

i) UML 
	
![UML](https://raw.githubusercontent.com/dcresnitzky/LCP/master/Uml_final.PNG)


ii) Principais Classes e métodos.

  O sistema é composto por 3 classes principais: Pessoa, Pedido e Produto.
  
  Para a classe Pessoa há apenas 1 atributo, o nome da pessoa que é do tipo String. 
  
  Há 2 classes-filha de pessoa, Cliente e Funcionário. Para a classe Cliente há 2 atriutos, um ArrayList de Endereços - uma classe com atributos como rua, número, bairro, entre outros - e o telefone do tipo int. Na classe Funcionário, há 3 atributos, o registro do funcionário, que é uma variável do tipo int. Os outros atributos são login e senha do tipo int. O login e senha explicam-se pelo fato do sistema usar diferentes tipos de autenticação para cada classe de usuário. Para efetuar o login no sistema, as classes Atendente e Gerente, que são filhas de funcionário, implementam a interface Autenticável que fornece os métodos para a autenticação. A classe Atendente tem 1 atributo, o ramal do telefone do atendente. Uma terceira classe filha de funcionário foi criada, a classe Motoboy. Essa classe tem 1 atributo, do tipo String: a placa da moto.
  
  A classe Produto é a classe que abstrai os produtos vendidos pela pizzaria. Ela possui os atributos: código do tipo int, nome do tipo String, categoria do tipo Categoria, preço do tipo double e ingredientes que é um ArrayList do tipo Ingrediente. As classes Categoria e Ingrediente, mencionadas na classe Produto, possuem apenas 1 atributo cada uma: nome do tipo String.
  
  Há um classe que se relaciona com a classe Produto que se chama ProdutoPedido. Essa classe possui 3 atributos: produto do tipo Produto, quantidade do tipo int e obs(observacoes) do tipo String. ProdutoPedido existe para relacionar adequadamente a quantidade de cada produto dentro dos Pedido bem como suas respectivas observações. Caso um cliente queira uma pizza de calabresa sem tomate, essa nota será armazenada no campo observação.
  
   A terceira classe principal é a classe Pedido. Essa classe possui 14 atributos: cliente do tipo Cliente, produtos que é um ArrayList de ProdutoPedido, atendente do tipo Funcionario, entregador do tipo Funcionario, endereço do tipo endereço, entrega do tipo boolean, desconto, taxaEntrega e valor do tipo double, formaPagamento do tipo int, troco do tipo double, data e hora do tipo Date e status do tipo int. Caso o pedido seja falso a variável endereço pode estar vazia.
  
   A variável formaPagamento é do tipo int pois se o cliente escolher a dinheiro como forma de pagamento, a variável formaPagamento será definida com o valor 0. Se a forma de pagamento escolhida não for dinheiro, a variável troco receberá valor 0 e a variável formaPagamento será setada com valor 1 para cartão de débito, 2 para cartão de crédito, 3 para vale refeição, e assim por diante. 


iii) Views

Login

![Login](https://raw.githubusercontent.com/dcresnitzky/LCP/master/views/Login.PNG)

MainView

![MainView](https://raw.githubusercontent.com/dcresnitzky/LCP/master/views/MainView.PNG)

Novo Pedido

![NovoPedido](https://raw.githubusercontent.com/dcresnitzky/LCP/master/views/NovoPedido.PNG)

Clientes

![Clientes](https://raw.githubusercontent.com/dcresnitzky/LCP/master/views/Clientes.PNG)

Produtos

![Produtos](https://raw.githubusercontent.com/dcresnitzky/LCP/master/views/Produtos.PNG)

Cardapio

![Cardapio](https://raw.githubusercontent.com/dcresnitzky/LCP/master/views/Cardapio.PNG)

Funcionarios

![Funcionarios](https://raw.githubusercontent.com/dcresnitzky/LCP/master/views/Funcionarios.PNG)

Novo Produto

![NovoProduto](https://raw.githubusercontent.com/dcresnitzky/LCP/master/views/NovoProduto.PNG)

Detalhes Do Produto

![DetalhesDoProduto](https://raw.githubusercontent.com/dcresnitzky/LCP/master/views/DetalhesDoProduto.PNG)

Confirmacao

![Confirmacao](https://raw.githubusercontent.com/dcresnitzky/LCP/master/views/Confirmacao.PNG)

5) Código fonte 

Nos arquivos. 

6) Bibliografia 

Apostila CAELUM [http://www.caelum.com.br/apostila-java-orientacao-objetos/]


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

CREATE TABLE `endereco` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cliente_id` int(11) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `cliente_id_idx` (`cliente_id`),
  CONSTRAINT `cliente_id` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
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

CREATE TABLE `produto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `preco` varchar(45) DEFAULT NULL,
  `categoria_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_categoria_idx` (`categoria_id`),
  CONSTRAINT `id_categoria` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  CONSTRAINT `id_atendente` FOREIGN KEY (`id_atendente`) REFERENCES `funcionario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_endereco` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_entregador` FOREIGN KEY (`id_entregador`) REFERENCES `funcionario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_pagamento` FOREIGN KEY (`id_pagamento`) REFERENCES `pagamento` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  CONSTRAINT `id_pedido2` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_produto2` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `produto_ingrediente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_produto` int(11) NOT NULL,
  `id_ingrediente` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_produto_idx` (`id_produto`),
  KEY `id_ingrediente_idx` (`id_ingrediente`),
  CONSTRAINT `id_ingrediente` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingrediente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_produto` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
