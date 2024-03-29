package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.situacao.Reprovado;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Or�amento n�o pode ser aprovado!");
		
	}

	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Or�amento n�o pode ser reprovado!");
		
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Or�amento n�o pode ser finalizado!");
		
	}
	
}
