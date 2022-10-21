package br.com.alura.escola.dominio.aluno;

//Value object - não é Entidade: não tem diferenciação - 2 emails c/ mesmo endereço: é o mesmo endereço
public class Email {

	private String endereco;

	//validação no construtor
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
