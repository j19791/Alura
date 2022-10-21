### Domain Driven Design

- domain "driven" design
- desenvolver sw orientado ao dom�nio
- menos foco na tecnologia e mais dom�nio da aplica��o
- invariante (business invariant): regras de neg�cio, valida��o. N�o permitir inconsist�ncia
- agreggates:
- sistemas distribu�dos (microservi�os)
- camada anticorrup��o: sistemas de mensageria
	- evitar acoplamento entre os diversos sistemas

#### Linguagem Ub�quia
- desenvolvedores e analistas de neg�cio: linguagem comum que as duas equipes conseguem se entender

#### Contexto delimitado
- uma informa��o pode mudar suas caracter�sticas dependendo do contexto

#### Bloco de constru��o
- como levar para o c�digo o dom�nio ? 
- Modelar atrav�s de padr�es o dom�nio dentro da aplica��o
- Entidades
- VO: Value Objects
- Reposit�rio: persist�ncia - guardar e recuperar info de algum lugar (bd, arquivo, etc)
- Services
- Factory

#### Separa��o em camadas
- Dom�nio
	- quando precisa de uma infra - usar interface
- aplicacao
	- os casos de uso
	
#### Eventos
- js: clique do mouse, etc dispara um evento (notifica��o) para ser realizado um processamento
- programa��o orientada a eventos
- menos acoplamento.
- ouvinte do evento: reage ao evento
- publicar o evento:

#### Contextos delimitados (Bounded Contexts)
- a separa��o em contextos nos d� mais flexibilidade por�m aumenta (e muito) a complexidade
- menos acoplado
- mapas de contexto
	- Contexto compartilhado: 
		- utilizado em mais de um contexto
		- mais f�cil de possibilitar a comunica��o mas tira boa parte da flexibilidade