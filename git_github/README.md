### Git e GITHUB

> Status do projeto: Em desenvolvimento

#### repositório
- diretório onde ficarão reunidos todos os arquivos do projeto e poderá ser acessado por todas as pessoas da equipe.
- repo.new
- Readme.md - passo a passo para trabalhar nesse projeto
- repositorio central (origem)	

```
node app.js
```
	
#### commit: 
- rótulo das alterações que realizei
- marco ao longo do cronograma de um projeto
- guarda o status do seu projeto naquele momento

#### VSCode
- apertar a tecla ponto e esperar carregar
- atalhos
	-  ! inclui template
	-  comita as alterações

### linha de comando
- git clone https://github.com/j19791/Alura.git
- git log 
	- traz todo histórico daquele projeto
	- para sair q
	- --oneline
- git pull https://github.com/j19791/Alura.git
	- atualiza localmente o repositório
- git status 
	- verifica os arquivos modificados localmente
- git add .
	- adiciona os arquivos para controle de versão
	
- git commit nome_do_arquivo -m "mensagem"
- git push origin main
	- empurra p/ o repo central (origem)
- git restore --source 116fb80 . 
	- restaura localmente o código do commit representado pelo hash
	- necessário commitar e realizar o push para o origin p/ q o restore funcione p/ todos
	- . restaura todos os arquivos . vc pode especificar o restaura de um arquivo específico
	
	
