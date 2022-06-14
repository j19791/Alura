package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
		
		
		//classe q não para de crescer nunca. Regra de negócio varia de acordo com o tipo do parametro
		 return tipoImposto.calcular(orcamento);
		
		
		
	}
	
}
