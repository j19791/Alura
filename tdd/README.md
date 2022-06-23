## TDD e Java: Testes Automatizados com JUNit

- testes automatizados
- diminui impactos negativos
- feedback mais rápido
- segurança ao alterar o código
- influencia na melhoria do código (refactoring)
- diminui as falhas de programação e teste manual devido ao fator humano

### Testes Automatizados
- código que testa código
- rastreamento mais eficaz

### JUNit
- biblioteca padrão para escrita de testes automatizados
- adicionando dependencia
```xml
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>5.7.0</version>
			<scope>test</scope>
		</dependency>

```
- gratuito e open-source
- foco em testes de unidade (unitários)
- nomeDaClasseTest
- cada cenário é um método: deveriaSomarDoisNumerosPOsitivos()
	- anotação @Test
- integração com Eclipse
	- eclipse importa a lib automaticamente no projeto escreve apenas @Test
	- Run as JUnit
- *Assert*
	- Equals(valor esperado, valor que devo verificar); 	
		- `assertEquals(BigDecimal.ZERO, bonus);`