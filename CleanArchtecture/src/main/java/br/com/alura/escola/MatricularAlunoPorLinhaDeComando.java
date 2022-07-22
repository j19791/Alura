package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.infra.aluno.RepositorioDeAlnuosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";
		
		MatricularAlunoDto dto =   new MatricularAlunoDto(nome, cpf, email);
		
		MatricularAluno ma = new MatricularAluno(new RepositorioDeAlnuosEmMemoria());
		ma.executa(dto);
		
		
		

	}

}
