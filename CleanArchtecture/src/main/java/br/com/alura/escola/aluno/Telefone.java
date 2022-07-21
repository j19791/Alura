package br.com.alura.escola.aluno;

public class Telefone {

	private String ddd;
	private String numero;
	
	
	
	public Telefone(String ddd, String numero) {
		//validacao
		
		/*
		 * (?:([1-9]{2})|([0-9]{3})?)
		 * 
		 * Busca por dois n�meros de 1 � 9, ou tr�s n�meros de 0 � 9, isso faz a
		 * diferen�a entre o DDD com zero e DDD sem zero, lembrando que nenhum c�digo de
		 * cidade tem o digito 0. Tamb�m opcional. (\d{4,5})(\d{4})
		 * 
		 * Segue buscando por dois grupos de n�meros, um de 5 ou 4 digitos, que
		 * diferencia n�meros de celular e telefones fixos (celulares tem o digito 9 a
		 * mais no come�o), e os �ltimos n�meros que s�o sempre 4 digitos segundo o
		 * padr�o de n�meros de telefones do Brasil.
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
