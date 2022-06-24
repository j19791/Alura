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
			
		//		Refactoring: utilizar o padr�o strategy
		BigDecimal reajuste = f.getSalario().multiply(d.percentualReajuste());
					
		f.reajustarSalario(reajuste);
		
	}

}
