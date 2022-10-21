### Maven: gerenciamento de dependências e build de aplicações Java
- utiliza o Ant por baixo dos panos
- maven.apache.og
- versão 3.*.*
- dentro da IDE ja tem um IDE embutido (integrado)
- mvnrepository.com
	- repositório central: projeto faz consulta e baixa
	- pegar a última versão estável

#### Processo de Build
- pacote p/ deploy (colocar no ar)
- por padrão é jar <packaging>
- Eclipse export/war file
- tarefas que deverão ser executadas antes de gerar o war
	- rodar os testes unitários
	- trocar as properties do ambiente de desenvolvimento p/ o ambiente de produção
- Apache Ant: automatização do build
	- build.xml
	- não gerencia as dependências
- linha de comando: mvn
	- dentro do diretório da aplicação
	- goals: objetivos (pode ser mais de um)
		- compile 
			- Compiling n source file to : local onde o class foi gerado 
		- clean : update project (limpa o dir target)
		- test: roda os testes automatizados
		- package : gera o war/jar
			- gera por padrão no target
		- install : localmente joga no cache local
		- deploy: roda todo o passo passo e joga em um repositório remoto: disponibilizado p/ outros 
		
```xml
<build>
        <plugins>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId> <!--versao do java -->
                <configuration>
                    <source>11</source>
                    <target>11</target>
                </configuration>
            </plugin>
        </plugins>
        <finalName>loja</finalName><!-- s/versao --> 
</build>

```
- plugins: manipula o build da aplicação 
	- jetty : servidor web
		- mvn jetty:run
	- jacoco : relatório de cobertura de testes
		- no próprio goal test é gerado um site no target com uma página html


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
- mvn procura primeiro cache local : todas as dependências ja baixadas na máquina
	.m2
- senão encontrar, procura no repoitório central
- erro na tag xml (erro de sincronização)
	- update maven project
	- apagar as dependencias dentro do .m2

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
	
#### Repositórios
- configurando um respositório não padrão

```xml
    <repositories>
        <repository>
            <id>spring-repo</id>
            <url>https://repo.spring.io/release</url>
        </repository>
    </repositories>
```

#### Proxy
- para o mvn acessar a internet através de um proxy
- .m2/settings.xml
	- criar o arquivo se não existe
	- incluir as configurações do proxy 
	- <repositories> da para incluir e é usado para todos os projetos da maquina mas se existe no pom uma tag repositories configurada, ela não é sobreescrita
```xml
  <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 https://maven.apache.org/xsd/settings-1.0.0.xsd">  
    <proxies>
        <proxy>
                    <id>genproxy</id>
                    <active>true</active>
                    <protocol>http</protocol>
                    <host>proxyHost</host>
                    <port>3128</port>
                    <username>username</username>
                    <password>password</password>
        </proxy>
    </proxies>
   </settings>
```
    	
#### Módulos
- pom do parent: projeto pai p/ agrupar os módulos
	- packaging: pom
	<modules>
- pom do modulo:
	- não tem artifactId
```xml
<parent>

``` 
- os módulos filhos automaticamente ja importam as dependências do pom do pai
- gerar o build pelo pai: vai buildar todos os módulos filhos
- os módulos podem ser dependencias dos módulos irmãos