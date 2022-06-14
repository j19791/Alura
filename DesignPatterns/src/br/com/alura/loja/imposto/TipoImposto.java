package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public interface TipoImposto {
	BigDecimal calcular(Orcamento orcamento);
}
