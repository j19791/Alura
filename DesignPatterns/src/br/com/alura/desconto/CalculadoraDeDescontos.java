package br.com.alura.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		
		//passando sempre o próximo desconto até que alguma ou nnehuma seja aplicada
		return new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()))
				.calcular(orcamento);
		
		
		
		
	}
	
}
