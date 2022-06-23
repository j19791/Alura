## TDD e Java: Testes Automatizados com JUNit

- testes automatizados
- diminui impactos negativos
- feedback mais r�pido
- seguran�a ao alterar o c�digo
- influencia na melhoria do c�digo (refactoring)
- diminui as falhas de programa��o e teste manual devido ao fator humano

### Testes Automatizados
- c�digo que testa c�digo
- rastreamento mais eficaz

### JUNit
- biblioteca padr�o para escrita de testes automatizados
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
- foco em testes de unidade (unit�rios)
- nomeDaClasseTest
- cada cen�rio � um m�todo: deveriaSomarDoisNumerosPOsitivos()
	- anota��o @Test
- integra��o com Eclipse
	- eclipse importa a lib automaticamente no projeto escreve apenas @Test
	- Run as JUnit
- *Assert*
	- Equals(valor esperado, valor que devo verificar); 	
		- `assertEquals(BigDecimal.ZERO, bonus);`