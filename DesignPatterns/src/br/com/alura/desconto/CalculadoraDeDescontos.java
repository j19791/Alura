package br.com.alura.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		
		
		//toda nova regra de descontos, usar um novo if
		//nao sabemos qual desconto aplicar. Obrigatório passar por cada tipo de desconto para ver sua aplicabilidade
		//não indicado usar Strategy: não tem um parametro
		if(orcamento.getQuantidadeDeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));	
		}
		
		if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return BigDecimal.ZERO;
		
	}
	
}
