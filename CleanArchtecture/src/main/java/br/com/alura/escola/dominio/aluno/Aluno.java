package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

//Entidade: classe que cont�m um campo com id �nico
public class Aluno {

	private CPF cpf; //id �nico - n�o colocar id p/ n�o misturar c/ infra (bd)
	private String nome; //n�o � o id �nico p/ identificar os alunos
	private Email email; //usar regras de valida��o
	private List<Telefone> telefones = new ArrayList<>();
	private String senha; //precisa estar protegida -> seguran�a: infra-estrutura
	
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

	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}

	//complexo para criar novo aluno: preciso passar new nos parametros (new dentro de new) : 
	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	
	
	
	
}
