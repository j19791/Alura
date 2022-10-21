package br.com.alura.escola.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.dominio.aluno.Telefone;

public class RepositorioDeAlunosComJDBC implements  RepositorioDeAlunos{

	private final Connection conexao; 
	
	
	// injeção de dependencias - menos acoplado - esse código não vai ser responsável por gerenciar a conexão
	//quem ira instanciar essa classe será resposnsável por passar a conexão c/ o bd
	public RepositorioDeAlunosComJDBC(Connection conexao) {
		this.conexao = conexao;
	}

	@Override
	public void matricular(Aluno aluno) {
		String sql = "INSERT INTO ALUNO VALUES(?,?,?)";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			//substituir as interrogações
			ps.setString(1, aluno.getCpf());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.execute(); //
			
			
			sql = "INSERT INTO TELEFONE VALUES(?,?)";
			ps = conexao.prepareStatement(sql);
			for(Telefone telefone : aluno.getTelefones()) {
				ps.setString(1, telefone.getDdd());
				ps.setString(2, telefone.getNumero());				
				ps.execute();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarTodosAlinosMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}
