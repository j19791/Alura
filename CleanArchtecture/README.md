- dom�nio desacoplado da infra-estrutra
- f�cil p/ usar testes de unidade
- separar camadas usando os modulos do java 9 ou do maven

#### Value Objects


#### Factories

#### Camadas: de fora p/ dentro
- dom�nio
	- Padr�o Repositorio: interface para persist�ncia. Independente da infra 

- aplica��o: n�o faz parte do dominio 
- use cases
- implementacao na infra

- infra-estrutura

#### Services
- Domain Services s�o classes que representam uma a��o entre mais de uma entidade.
- Application Services controlam o fluxo de alguma regra em nossa aplica��o.
- Infrastructure Services s�o implementa��es de interfaces presentes nas camadas de dom�nio ou de aplica��o.
- conceito (Interface) na camada de dominio e implementa��o na infra
- Quando precisamos executar alguma a��o que n�o fa�a parte de nenhuma entidade nem de um VO
	- criptografia de senhas
	
- Os termos Use Case, Application Service e Command Handler s�o basicamente sin�nimos e servem para fornecer pontos de entrada na sua aplica��o, de forma independente dos mecanismos de entrega (Web, CLI, etc).




