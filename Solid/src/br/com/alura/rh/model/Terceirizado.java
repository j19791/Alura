package br.com.alura.rh.model;

import java.math.BigDecimal;

//cuidado ao usar herança: Terceirizado é um Funcionário ?
//tudo que esta na classe Funcionario esta na classe Terceirizado ??
//promocao e reajuste compete a empresa que contratou o terceirizado
//PromocaoService e ReajusteService possuem métodos que recebem funcionario !!!
public class Terceirizado /*extends Funcionario*/{
	
	private DadosPessoais dadosPessoais; //favorecer a composição no lugar da herança

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
