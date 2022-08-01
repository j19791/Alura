### Domain Driven Design

- domain "driven" design
- desenvolver sw orientado ao domínio
- menos foco na tecnologia e mais domínio da aplicação
- invariante (business invariant): regras de negócio, validação. Não permitir inconsistência
- agreggates:
- sistemas distribuídos (microserviços)
- camada anticorrupção: sistemas de mensageria
	- evitar acoplamento entre os diversos sistemas

#### Linguagem Ubíquia
- desenvolvedores e analistas de negócio: linguagem comum que as duas equipes conseguem se entender

#### Contexto delimitado
- uma informação pode mudar suas características dependendo do contexto

#### Bloco de construção
- como levar para o código o domínio ? 
- Modelar através de padrões o domínio dentro da aplicação
- Entidades
- VO: Value Objects
- Repositório: persistência - guardar e recuperar info de algum lugar (bd, arquivo, etc)
- Services
- Factory

#### Separação em camadas
- Domínio
	- quando precisa de uma infra - usar interface
- aplicacao
	- os casos de uso
	
#### Eventos
- js: clique do mouse, etc dispara um evento (notificação) para ser realizado um processamento
- programação orientada a eventos
- menos acoplamento.
- ouvinte do evento: reage ao evento
- publicar o evento:

#### Contextos delimitados (Bounded Contexts)
- a separação em contextos nos dá mais flexibilidade porém aumenta (e muito) a complexidade
- menos acoplado
- mapas de contexto
	- Contexto compartilhado: 
		- utilizado em mais de um contexto
		- mais fácil de possibilitar a comunicação mas tira boa parte da flexibilidade