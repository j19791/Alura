package br.com.alura.rh.model;

import java.math.BigDecimal;

//cuidado ao usar heran�a: Terceirizado � um Funcion�rio ?
//tudo que esta na classe Funcionario esta na classe Terceirizado ??
//promocao e reajuste compete a empresa que contratou o terceirizado
//PromocaoService e ReajusteService possuem m�todos que recebem funcionario !!!
public class Terceirizado /*extends Funcionario*/{
	
	private DadosPessoais dadosPessoais; //favorecer a composi��o no lugar da heran�a

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	private String empresa;
	
	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
		this.empresa = empresa;
	}

}
