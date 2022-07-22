### Domain Driven Design

- domain "driven" design
- desenvolver sw orientado ao dom�nio
- menos foco na tecnologia e mais dom�nio da aplica��o
- invariante (business invariant): regras de neg�cio, valida��o

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