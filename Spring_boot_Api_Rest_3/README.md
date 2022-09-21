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
- Deploy com Docker e na nuvem
	- Utilize Docker na API
	- Realize o deploy da API no Heroku
	

```
netstat -ano | findstr :8080
  TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       5712
  TCP    [::]:8080              [::]:0                 LISTENING       5712

taskkill /PID 5712 /F
ÊXITO: o processo com PID 5712 foi finalizado.

```