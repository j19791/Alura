package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
		
		
		//classe q não para de crescer nunca. Regra de negócio varia de acordo com o tipo do parametro
		switch(tipoImposto) {
		case ICMS: return orcamento.getValor().multiply(new BigDecimal("0.1"));
		case ISS: return orcamento.getValor().multiply(new BigDecimal("0.06"));
		default: return BigDecimal.ZERO;
		}
		
	}
	
}
