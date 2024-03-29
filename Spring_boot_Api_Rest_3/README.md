### Spring Framework

#### API REST e Testes com Spring Boot

##### Spring Boot e Teste: Profiles, Testes e Deploy

- Mais segurança 
	- Atualize a versão do Spring Boot da API
		- bean-validation não vem mais por padrão. Tem que incluir manualmente
	- Proteja endpoints baseados em perfil de usuário
- Profiles
	- Separe configurações em Profiles
	- perfils/ ambientes
- Testes automatizados
	- Escreva testes automatizados de componentes do Spring Boot
- Deploy
	- empacotamento padrão : jar
	- Simule o deploy da API localmente
	- Springboot: servidor dentro da aplicação
	- pelo Eclipse:
		run as > maven install
		runs as > maven build .. goals: clean package 
	- no terminal
		- na raiza do projeto> mvn clean package
	- jar dentro da pasta target na raiz
		- sufixo da versao  passado no pom
	- rodar jar (não precisa de servidor de aplicação com Spring boot)
		- dentro da pasta target
		- `java -jar forum.jar`
	- Externalizando senhas com variáveis de ambiente
		- Run as > Run configurations
			Java application - Vm arguments : determina com vai ser rodado a aplicação 
				-Dspring.profiles.active=dev
		- no terminal: subindo como producao
			java -jar -Dspring.profiles.active=prod  forum.jar
		-usando variaveis de ambiente
		- application-prod.properties
		```
		# datasource
		spring.datasource.driverClassName=org.h2.Driver
		spring.datasource.url=${FORUM_DATABASE_URL}
		spring.datasource.username=${FORUM_DATABASE_USERNAME}
		spring.datasource.password=${FORUM_DATABASE_PASSWORD}
		```
		- atribuindo valor as variaveis		
		```
			export FORUM_DATABASE_URL=jdbc:h2:mem:alura-forum
			export FORUM_DATABASE_USERNAME=sa
			export FORUM_DATABASE_PASSWORD=
			export FORUM_JWT_SECRET=123456
		```
		- rodando no terminal passando parametros
		```
		java -jar -Dspring.profiles.active=prod -DFORUM_DATABASE_URL=jdbc:h2:mem:alura-forum -DFORUM_DATABASE_USERNAME=sa -DFORUM_DATABASE_PASSWORD= -DFORUM_JWT_SECRET=123456 forum.jar
		```
		
	- Deploy tradicional com arquivo war
		- jogar dentro do servidor de aplicações
		
		
- Deploy com Docker e na nuvem
	- Gerando imagem Docker da aplicação
		- criar arquivo Dockerfile
		- rodando o daemon do docker na linha de comando no modo administrador  `dockerd --experimental` 		
		docker build -t alura/forum .

```
netstat -ano | findstr :8080
  TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       5712
  TCP    [::]:8080              [::]:0                 LISTENING       5712

taskkill /PID 5712 /F
ÊXITO: o processo com PID 5712 foi finalizado.

```