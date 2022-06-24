package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

/*O sistema deve permitir que os funcion�rios recebam um reajuste salarial anual baseado em seu desempenho, obedecendo �s seguintes regras:

Se o desempenho for classificado como "A desejar", o reajuste ser� de 3% do sal�rio atual.
Se o desempenho for "Bom,", o reajuste ser� de 15% do sal�rio.
Se o desempenho for "�timo", o reajuste ser� de 20% do sal�rio.*/

public class ReajusteService {

	public void concederReajuste(Funcionario f, Desempenho d) {
		
		BigDecimal reajuste = BigDecimal.ZERO;
		
		switch(d) {
		case A_DESEJAR : reajuste = f.getSalario().multiply(new BigDecimal("0.03")); break;
		case BOM:  reajuste = f.getSalario().multiply(new BigDecimal("0.15")); break;
		case OTIMO: reajuste = f.getSalario().multiply(new BigDecimal("0.20"));
		}
		
			
		f.reajustarSalario(reajuste);
		
	}

}
