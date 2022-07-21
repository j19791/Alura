package br.com.alura.escola.dominio.aluno;

import java.util.List;

//contrato - comportamentos q precisamos p/ o domínio
// a implementação vai ser na camada da infra (jdbc/jpa/etc)
//camada de domínio isolada da infra
//inversão de dependencia
public interface RepositorioDeAlunos {

	//no domínio não é salvar aluno: é matricular
	void matricular(Aluno aluno); //salva no bd
	
	Aluno buscarPorCPF(CPF cpf);
	
	List<Aluno> listarTodosAlinosMatriculados();
	
}
