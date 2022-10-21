- domínio desacoplado da infra-estrutra
- fácil p/ usar testes de unidade
- separar camadas usando os modulos do java 9 ou do maven

#### Value Objects


#### Factories

#### Camadas: de fora p/ dentro
- domínio
	- Padrão Repositorio: interface para persistência. Independente da infra 

- aplicação: não faz parte do dominio 
- use cases
- implementacao na infra

- infra-estrutura

#### Services
- Domain Services são classes que representam uma ação entre mais de uma entidade.
- Application Services controlam o fluxo de alguma regra em nossa aplicação.
- Infrastructure Services são implementações de interfaces presentes nas camadas de domínio ou de aplicação.
- conceito (Interface) na camada de dominio e implementação na infra
- Quando precisamos executar alguma ação que não faça parte de nenhuma entidade nem de um VO
	- criptografia de senhas
	
- Os termos Use Case, Application Service e Command Handler são basicamente sinônimos e servem para fornecer pontos de entrada na sua aplicação, de forma independente dos mecanismos de entrega (Web, CLI, etc).




