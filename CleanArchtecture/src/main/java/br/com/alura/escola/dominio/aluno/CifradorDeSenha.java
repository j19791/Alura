package br.com.alura.escola.dominio.aluno;

//dominio - conceito - senha deverá ser protegida. A implementação é um detalhe de infra
public interface CifradorDeSenha { //serviço

	String cifrarSenha(String senha);
	
	boolean validarSenhaCifrada(String senhaCifrada, String senha);
}
