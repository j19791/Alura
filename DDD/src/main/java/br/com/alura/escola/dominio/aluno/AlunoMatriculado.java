package br.com.alura.escola.dominio.aluno;

import java.time.LocalDateTime;

import br.com.alura.escola.dominio.Evento;

//evento: vários processos são disparados quando o evento matricular um aluno
//1) que aluno foi matriculado ?
public class AlunoMatriculado implements Evento {
	
	private final CPF cpfDoAluno;
	private final LocalDateTime momento;

	public AlunoMatriculado(CPF cpfDoAluno) {
		this.cpfDoAluno = cpfDoAluno;
		this.momento = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momento() {
		
		return this.momento;
	}

	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}

}
