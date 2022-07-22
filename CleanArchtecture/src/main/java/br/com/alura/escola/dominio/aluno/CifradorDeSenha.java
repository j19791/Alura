package br.com.alura.escola.dominio.aluno;

//dominio - conceito - senha dever� ser protegida. A implementa��o � um detalhe de infra
public interface CifradorDeSenha { //servi�o

	String cifrarSenha(String senha);
	
	boolean validarSenhaCifrada(String senhaCifrada, String senha);
}
