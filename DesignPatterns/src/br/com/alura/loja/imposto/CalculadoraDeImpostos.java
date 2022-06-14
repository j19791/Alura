package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
		
		
		//classe q n�o para de crescer nunca. Regra de neg�cio varia de acordo com o tipo do parametro
		 return tipoImposto.calcular(orcamento);
		
		
		
	}
	
}
