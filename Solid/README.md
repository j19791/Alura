### Solid

- S: Single responsibility
	- uma classe deve ter um e apenas um motivo para ser alterada
- O: Open Closed
	- não precisa alterar um método para realizar coisas específicas. Alterar apenas a coisa específica em uma classe específica.
	- código mais flexível - extensível
	- procurar não alterar mas sim adicionar.
	- usar polimorfismo com interfaces 
- L: Liskov Substitution
	- um pato de borracha não é um pato de verdade: não usar herança. Usar composição
	- efeitos colaterias
- Principios de OO
- para modelar as classes da aplicação

#### Coesão 
- harmonia entre atributos e métodos dentro de uma classe
- Cada classe deve ser responsável por apenas uma coisa, e deve executar esta tarefa muito bem. Concisa
- Single Responsibility: aumenta coesão. Enxuta

#### Encapsulamento
- blindar uma classe contra influências / manipulações externas das informações
- classes não encapsuladas permitem violação de regras de negócio além de aumentarem o acoplamento

#### Acoplamento
- dependencias entre classes
- acoplamento muito forte é ruim: uma classe conhece detalhes da outra
- Algumas classes precisarão de outras, para que não tenham muitas responsabilidades. Cabe a nós medir quando faz sentido adicionar tal acoplamento com as dependências e como depender do que é seguro, ao invés de classes concretas.
