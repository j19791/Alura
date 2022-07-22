package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlnuosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlnuosEmMemoria rep = new RepositorioDeAlnuosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(rep);
		
		
		MatricularAlunoDto dados = new MatricularAlunoDto("Fulano da Silva", "123.456.789-00", "fulano@email.com") ;
		useCase.executa(dados );
		
		Aluno encontrado = rep.buscarPorCPF(new CPF("123.456.789-00"));
		
		assertEquals("Fulano da Silva", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("fulano@email.com", encontrado.getEmail());
	}

}
