package br.com.alura.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	//Template Method: método concreto na classe mãe para chamar os métodos abstratos implementados nas classes filhas 
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {//delega p/ as classes concretas (filhas) testar 
			return efetuarCalculo(orcamento); //delega p/ as classes concretas (filhas) o calculo
		}
		
		return proximo.efetuarCalculo(orcamento);
	}
	
	public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	
	public abstract boolean deveAplicar(Orcamento orcamento);
	
}
