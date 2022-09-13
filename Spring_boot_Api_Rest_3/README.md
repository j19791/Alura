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
	- Simule o deploy da API localmente
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