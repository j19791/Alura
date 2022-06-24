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
		
### TDD
- nova abordagem de desenvolvimento com testes automatizados
- comportamento mais importante que implementa��o
- padr�o anterior: c�digo antes, testes depois
- TDD: testes antes, c�digo depois
- o teste vai guiando o desenvolvimento (rascunho)
- testes -> implementa��o -> refatora��o -> testes ....
- refatora��o: melhorada no c�digo sem alterar o comportamento: padr�o de prejeto, polimorfismo
- vantagens: 
	- c�digo ja sai testado
	- evita testes viciados na implementa��o 
	- refatora��o faz parte do processo
	- ajuda a manter o foco
	- temos uma tendencia em escrever um c�digo mais simples
