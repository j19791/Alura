package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

//Entidade: classe que contém um campo com id único
public class Aluno {

	private CPF cpf; //id único - não colocar id p/ não misturar c/ infra (bd)
	private String nome; //não é o id único p/ identificar os alunos
	private Email email; //usar regras de validação
	private List<Telefone> telefones = new ArrayList<>();
	
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
