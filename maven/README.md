### Maven: gerenciamento de dependências e build de aplicações Java
- utiliza o Ant por baixo dos panos
- maven.apache.og
- versão 3.*.*
- dentro da IDE ja tem um IDE embutido (integrado)

#### Processo de Build
- pacote p/ deploy (colocar no ar)
- war
- Eclipse export/war file
- tarefas que deverão ser executadas antes de gerar o war
	- rodar os testes unitários
	- trocar as properties do ambiente de desenvolvimento p/ o ambiente de produção
- Apache Ant: automatização do build
	- build.xml
	- não gerencia as dependências

#### Dependências
- libs
- jars: gerenciamento
- Apache Ivy: gerenciamento de dependências
	- ivy.xml
		- baixa e resolve as dependências
- scope
	- compile: preciso da dependencia apenas em tempo de compilação. No build não preciso
	- provided: a dependência é provida pelo servidor de aplicação
	- runtime: apenas em tempo de execução
	- test: apenas na execução dos testes
		- JUnit

#### Instalação
- baixar, descompactar o zip e adicionar a pasta bin no PATH

#### Linha de comando
- mvn --version
- mvn --help

#### Novo Projeto
- archetype: padrão para criação (estrutura necessária do projeto)
	- web, etc
	não obrigatório
- group id: organização da empresa: br.com.alura
- artifact id: nome do projeto (único nome dentro do grupo)
- empacotamento:
	- web: war
	- springboot: jar
- parent project:
- src/main/java: código fonte - classes, interfaces, enums java
- src/main/resources: arquivos de configurações especificas dos frameworks
	- acessível p/ o código fonte e libs
	- application.properties
	- hibernate.properties
	- arquivos static (imagens, etc)
- src/test/java: 
- src/text/resources: arquivos de configurações especificas dos frameworks p/ os testes automatizados
- pom.xml: arquivo de configuração do mvn
	- personaliza os diretórios source folder do projeto
	- plugins
	- dependências
	- módulos
- Adiconando Maven a um projeto existente
	- Configure/Convert to 
	- não troca a estrutura dos diretórios
- 
	

