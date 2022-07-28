### Domain Driven Design

- domain "driven" design
- desenvolver sw orientado ao domínio
- menos foco na tecnologia e mais domínio da aplicação
- invariante (business invariant): regras de negócio, validação. Não permitir inconsistência
- agreggates:

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
	
#### Eventos
- js: clique do mouse, etc dispara um evento (notificação) para ser realizado um processamento
- programação orientada a eventos
- menos acoplamento.
- ouvinte do evento: reage ao evento
- publicar o evento:

#### Contextos delimitados
- separar os contextos para simplificar o código
- menos acoplado
-