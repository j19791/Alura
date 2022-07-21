package br.com.alura.escola.aluno;

public class Telefone {

	private String ddd;
	private String numero;
	
	
	
	public Telefone(String ddd, String numero) {
		//validacao
		
		/*
		 * (?:([1-9]{2})|([0-9]{3})?)
		 * 
		 * Busca por dois números de 1 à 9, ou três números de 0 à 9, isso faz a
		 * diferença entre o DDD com zero e DDD sem zero, lembrando que nenhum código de
		 * cidade tem o digito 0. Também opcional. (\d{4,5})(\d{4})
		 * 
		 * Segue buscando por dois grupos de números, um de 5 ou 4 digitos, que
		 * diferencia números de celular e telefones fixos (celulares tem o digito 9 a
		 * mais no começo), e os últimos números que são sempre 4 digitos segundo o
		 * padrão de números de telefones do Brasil.
		 */
		
		this.ddd = ddd;
		this.numero = numero;
	}



	public String getDdd() {
		return ddd;
	}



	public void setDdd(String ddd) {
		this.ddd = ddd;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}
