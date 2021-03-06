package br.com.alura.escola.dominio.aluno;


//value object
public class CPF {
public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

private String numero;

public CPF(String numero) {
    if(numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))
        throw new IllegalArgumentException("CPF invalido!");
    
    this.numero = numero;
}
}
