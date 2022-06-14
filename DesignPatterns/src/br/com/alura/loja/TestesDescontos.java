package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"),4);
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
		System.out.println("Valor de DEconsto: " + calculadoraDeDescontos.calcular(orcamento));
		
		
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"),4);
		
		System.out.println("Valor de DEconsto: " + calculadoraDeDescontos.calcular(orcamento2));

	}

}
