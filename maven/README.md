### Maven: gerenciamento de depend�ncias e build de aplica��es Java
- utiliza o Ant por baixo dos panos
- maven.apache.og
- vers�o 3.*.*
- dentro da IDE ja tem um IDE embutido (integrado)
- mvnrepository.com
	- reposit�rio central: projeto faz consulta e baixa
	- pegar a �ltima vers�o est�vel

#### Processo de Build
- pacote p/ deploy (colocar no ar)
- por padr�o � jar <packaging>
- Eclipse export/war file
- tarefas que dever�o ser executadas antes de gerar o war
	- rodar os testes unit�rios
	- trocar as properties do ambiente de desenvolvimento p/ o ambiente de produ��o
- Apache Ant: automatiza��o do build
	- build.xml
	- n�o gerencia as depend�ncias
- linha de comando: mvn
	- dentro do diret�rio da aplica��o
	- goals: objetivos (pode ser mais de um)
		- compile 
			- Compiling n source file to : local onde o class foi gerado 
		- clean : update project (limpa o dir target)
		- test: roda os testes automatizados
		- package : gera o war/jar
			- gera por padr�o no target
		- install : localmente joga no cache local
		- deploy: roda todo o passo passo e joga em um reposit�rio remoto: disponibilizado p/ outros 
		
```xml
<build>
        <plugins>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>11</source><!--versao do java -->
                    <target>11</target>
                </configuration>
            </plugin>
        </plugins>
        <finalName>loja</finalName><!-- s/versao --> 
</build>

```
 

#### Depend�ncias
- libs
- jars: gerenciamento
- Apache Ivy: gerenciamento de depend�ncias
	- ivy.xml
		- baixa e resolve as depend�ncias
- scope
	- compile: preciso da dependencia apenas em tempo de compila��o. No build n�o preciso
	- provided: a depend�ncia � provida pelo servidor de aplica��o
	- runtime: apenas em tempo de execu��o
	- test: apenas na execu��o dos testes
		- JUnit
- mvn procura primeiro cache local : todas as depend�ncias ja baixadas na m�quina
	.m2
- sen�o encontrar, procura no repoit�rio central
- erro na tag xml (erro de sincroniza��o)
	- update maven project
	- apagar as dependencias dentro do .m2

#### Instala��o
- baixar, descompactar o zip e adicionar a pasta bin no PATH

#### Linha de comando
- mvn --version
- mvn --help

#### Novo Projeto
- archetype: padr�o para cria��o (estrutura necess�ria do projeto)
	- web, etc
	n�o obrigat�rio
- group id: organiza��o da empresa: br.com.alura
- artifact id: nome do projeto (�nico nome dentro do grupo)
- empacotamento:
	- web: war
	- springboot: jar
- parent project:
- src/main/java: c�digo fonte - classes, interfaces, enums java
- src/main/resources: arquivos de configura��es especificas dos frameworks
	- acess�vel p/ o c�digo fonte e libs
	- application.properties
	- hibernate.properties
	- arquivos static (imagens, etc)
- src/test/java: 
- src/text/resources: arquivos de configura��es especificas dos frameworks p/ os testes automatizados
- pom.xml: arquivo de configura��o do mvn
	- personaliza os diret�rios source folder do projeto
	- plugins
	- depend�ncias
	- m�dulos
- Adiconando Maven a um projeto existente
	- Configure/Convert to 
	- n�o troca a estrutura dos diret�rios
- 
	
#### Reposit�rios
- configurando um resposit�rio n�o padr�o

```xml
    <repositories>
        <repository>
            <id>spring-repo</id>
            <url>https://repo.spring.io/release</url>
        </repository>
    </repositories>
```

