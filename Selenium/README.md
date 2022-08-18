### Selenium: testes automatizados de aceitação em Java

- simula usuário navegando (UX)
- E2E: End to end

#### drive no navegador

#### Page objects - PO
- melhorar a legibilidade dos testes
- padrão para separar os testes automatizados do JUNIT e da api do  Selenium
- classe que representa uma página


#### Boas práticas
- usar Page objects: separar JUnit e Selenium
- der nome de métodos de testes e de PO orientados ao domínio: 
	- deveriaEfetuarLoginComDadosValidos()
	- efetuaLogin() 
- estado da aplicação: cada cenário de teste fazer o passo-a-passo
- usar Mock para testar com recursos externos para não comprometer mais ainda o tempo dos testes
- não usar Selenium para reporte de testes
- evitar compratilhar estados: sempre fazer o passo-a-passo 
- independência dos testes
- usar uma API fluente (encadeamento de seus métodos) para ser mais fácil de ler
- não reaproveitar a mesma janela. Abrir e fechar a janela do navegador.

