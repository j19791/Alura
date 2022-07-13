### Solid

- S: Single responsibility
	- uma classe deve ter um e apenas um motivo para ser alterada
- O: Open Closed
	- n�o precisa alterar um m�todo para realizar coisas espec�ficas. Alterar apenas a coisa espec�fica em uma classe espec�fica.
	- c�digo mais flex�vel - extens�vel
	- procurar n�o alterar mas sim adicionar.
	- usar polimorfismo com interfaces 
- L: Liskov Substitution
	- um pato de borracha n�o � um pato de verdade: n�o usar heran�a. Usar composi��o
	- efeitos colaterias
- Principios de OO
- para modelar as classes da aplica��o

#### Coes�o 
- harmonia entre atributos e m�todos dentro de uma classe
- Cada classe deve ser respons�vel por apenas uma coisa, e deve executar esta tarefa muito bem. Concisa
- Single Responsibility: aumenta coes�o. Enxuta

#### Encapsulamento
- blindar uma classe contra influ�ncias / manipula��es externas das informa��es
- classes n�o encapsuladas permitem viola��o de regras de neg�cio al�m de aumentarem o acoplamento

#### Acoplamento
- dependencias entre classes
- acoplamento muito forte � ruim: uma classe conhece detalhes da outra
- Algumas classes precisar�o de outras, para que n�o tenham muitas responsabilidades. Cabe a n�s medir quando faz sentido adicionar tal acoplamento com as depend�ncias e como depender do que � seguro, ao inv�s de classes concretas.
