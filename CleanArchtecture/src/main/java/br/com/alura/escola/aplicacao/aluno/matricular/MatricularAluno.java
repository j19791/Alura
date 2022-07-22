package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

//use case
//Command
public class MatricularAluno {

	private final RepositorioDeAlunos rep;

	public MatricularAluno(RepositorioDeAlunos rep) {
		this.rep = rep;
	}
	
	//DTO - Data transfer object - não tem lógica
	public void executa(MatricularAlunoDto dados) {//a camda de apresentação vai mandar os dados primitivos
		
		Aluno novo = dados.criarAluno();
		rep.matricular(novo);
	}
	
	
}
