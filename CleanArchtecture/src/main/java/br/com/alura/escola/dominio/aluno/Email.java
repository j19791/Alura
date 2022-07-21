package br.com.alura.escola.dominio.aluno;

//Value object - n�o � Entidade: n�o tem diferencia��o - 2 emails c/ mesmo endere�o: � o mesmo endere�o
public class Email {

	private String endereco;

	//valida��o no construtor
	public Email(String endereco) {
		if(endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Email invalido!");
		}
		this.setEndereco(endereco);
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
