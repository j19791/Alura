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
	
### branch
- main código principal (s/ erros) - não é a de desenvolvimento
- outras branchs (de desenvolvimento)
- git checkout -b desenvolvimento
	- cria uma branch de desenvolvimento e ja troca para ela
- git switch main
	- volta para a branch main
- git push origin desenvolvimento 
	- push p/ a branch especifica
- merge: pega o que esta no desenv e manda para o principal
	- no main local realizar o merge `git merge desenvolvimento`
	- `git push origin main` depois fazer o push do merge local para o origin
	

