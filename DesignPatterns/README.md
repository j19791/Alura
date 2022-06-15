## Anota��es do curso de Design Pattern

- Padr�es de projeto
- OO
- problemas repetitivos - solu��es prontas

### Strategy

- regra que varia com determinado padr�o: muitos if/else/switch
- Classe que usa interface/ Classe abstrata que implementa seu pr�rpio algoritmo.

### Chain of Responsability

- regra que varia com determinado padr�o: muitos if/else/switch
- n�o sei de cara o tipo de crit�rio que vai ser aplicado, obrigando eu chamar cada um dos crit�rios (o pr�ximo) at� o teste ok.
- final da cadeia: quando n�o acha nenhum crit�rio
- escalar as regras.

### Template Method
- classe abstrata tem um m�todo que invoca m�todos abstratos das classes filhas
- os m�todos abstratos invocados implementam regras espec�ficas das classes filhas

### State
- regra para transi��o de estados
- parecido com strategy: reduzir quantidade de if
- cada status � uma classe concreta diferente que sobreescreve o m�todo caso necess�rio ou lan�a exception

### Command

- Que um caso de uso em nossa aplica��o pode ter v�rias a��es (salvar no banco, enviar e-mail, etc);
- Que um caso de uso deve ser extra�do para uma classe espec�fica, ao inv�s de estar no arquivo da CLI, controller ou algo do tipo;

#### Command Handler
- domain driven designer
- uma classe para os dados
- uma classe para execu��o

### Observer
- perda de coesao: muitas responsabilidades: ruim de manuten��o
- classe continua crescendo com as a��es, mesmo isolando elas em classes
- invers�o de controle: inje��o de dependencias
- classes observadores esperam para serem chamadas