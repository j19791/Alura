package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

//Aggregate root: mantem/ raiz de vos. 
public class Aluno {
	
	private CPF cpf; //vo - 1 cpd precisa de 1 aluno (cpf não vive sozinho)
	private String nome;
	
	private Email email; //vo - 1 email precisa de 1 aluno
	
	private List<Telefone> telefones = new ArrayList<>(); //vo - 1 telefone precisa de 1 aluno
	
	private String senha;
	
	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	//invariante (validação)
	//nova regra: um aluno pode ter no másimo 2 telefones
	//desáfio: criar nova Exception. Teste de unidade para esse método
	//Garantir a consistência do telefone (vo) na classe Aluno (aggregate root)
	//a persistência tbm é feita no repositório do aggregate Aluno para garantir a consistência
	public void adicionarTelefone(String ddd, String numero) {
		if(telefones.size() == 2) {
			throw new IllegalArgumentException("Número máximo de telefones atingindos");
		}
		this.telefones.add(new Telefone(ddd, numero));
	}
	
	public String getCpf() {
		return cpf.getNumero();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email.getEndereco();
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public String getSenha() {
		return senha;
	}
	
}






