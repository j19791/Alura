package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.Aprovado;
import br.com.alura.loja.orcamento.situacao.EmAnalise;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeDeItens;
	private SituacaoOrcamento situacao;

	public Orcamento(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
		this.situacao = new EmAnalise();
	}

	public BigDecimal getValor() {
		return valor;
	}



	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}
	
	//regra dependendo do estado do orçamento
	public void aplicarDescontoExtra() {
		
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this); //this: o próprio orçamento
				
		this.valor = this.valor.subtract(valorDoDescontoExtra);	
	}
	
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
public void reprovar() {
		this.situacao.reprovar(this);
	}

public void finalizar() {
	this.situacao.finalizar(this);
}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
		
	}
	
	
}
