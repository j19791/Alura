package br.com.alura.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto{

public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

public BigDecimal calcular(Orcamento orcamento) {
		

		if(orcamento.getQuantidadeDeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));	
		}
		
		//nao aplicou o desconto, chama o próximo tipo de desconto
		return proximo.calcular(orcamento);
}
	
	
}
