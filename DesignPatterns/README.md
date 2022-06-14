## Anotações do curso de Design Pattern

- Padrões de projeto
- OO
- problemas repetitivos - soluções prontas

### Strategy

- regra que varia com determinado padrão: muitos if/else/switch
- Classe que usa interface/ Classe abstrata que implementa seu prórpio algoritmo.

### Chain of Responsability

- regra que varia com determinado padrão: muitos if/else/switch
- não sei de cara o tipo de critério que vai ser aplicado, obrigando eu chamar cada um dos critérios (o próximo) até o teste ok.
- final da cadeia: quando não acha nenhum critério
- escalar as regras.

### Template Method
- classe abstrata tem um método que invoca métodos abstratos das classes filhas
- os métodos abstratos invocados implementam regras específicas das classes filhas

### State
- regra para transição de estados
- parecido com strategy: reduzir quantidade de if
- cada status é uma classe concreta diferente que sobreescreve o método caso necessário ou lança exception