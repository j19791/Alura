package br.com.alura.escola.academico.dominio.aluno;

import java.time.format.DateTimeFormatter;

import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;

//ouvinte de um evento de dom�nio: AlunoMatriculado
public class LogDeAlunoMatriculado extends Ouvinte{

	public void reageAo(Evento evento) {
		
		String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		System.out.println(String.format("Aluno com CPF %s matriculado em: %s", ((AlunoMatriculado) evento).getCpfDoAluno(), evento.momento()));
	}

	

	@Override
	protected boolean deveProcessar(Evento evento) {
		
		return evento instanceof AlunoMatriculado;
	}
	
}
