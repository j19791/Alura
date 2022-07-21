package br.com.alura.escola.dominio.aluno;

import java.util.List;

//contrato - comportamentos q precisamos p/ o dom�nio
// a implementa��o vai ser na camada da infra (jdbc/jpa/etc)
//camada de dom�nio isolada da infra
//invers�o de dependencia
public interface RepositorioDeAlunos {

	//no dom�nio n�o � salvar aluno: � matricular
	void matricular(Aluno aluno); //salva no bd
	
	Aluno buscarPorCPF(CPF cpf);
	
	List<Aluno> listarTodosAlinosMatriculados();
	
}
