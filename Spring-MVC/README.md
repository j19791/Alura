### Spring MVC: autenticação com Spring Security, API Rest e AJAX

- Ambiente
	- application.properties :
		- alterar senha para em branco
	- MariaDB
		- criar banco de dados: mudi		
		- usuário: root
		- senha:
		- porta: 3306 
	- HeidiSQL: cliente - vem junto com o MariaDB
	- localhost:8080/home

#### Autenticação com Spring Security
	- Implementando o Login
		- incluir dependencia
		- incluir classe de segurança no projeto
		
#### Provedor de autenticação

- Mostrando os pedidos do usuário
- Associando o usuário ao pedido

#### Paginação e cache

- Controlando os usuários
- Ajustando a navegação
- Paginação
- Cache
	- guarda esse conteúdo (dados do bd) por algum tempo em memória p/ evitar consultas no bd
	- performar

#### Construindo uma API REST

- Introdução ao REST
- integrar aplicações: - mobile X backend java	
- usa o http entre aplicações: verbo http, código http (sucesso, etc)
- requisição com verbo http (GET, POST, PUT, etc) para aplicação consultar, incluir, atualizar um bd e devolver uma resposta em formato json (não html) ou código de sucesso, erro, etc
		 
- Criando o REST Controlller	