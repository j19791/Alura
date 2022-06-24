package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

/*O sistema deve permitir que os funcionários recebam um reajuste salarial anual baseado em seu desempenho, obedecendo às seguintes regras:

Se o desempenho for classificado como "A desejar", o reajuste será de 3% do salário atual.
Se o desempenho for "Bom,", o reajuste será de 15% do salário.
Se o desempenho for "Ótimo", o reajuste será de 20% do salário.*/

public class ReajusteService {

	public void concederReajuste(Funcionario f, Desempenho d) {
			
		//		Refactoring: utilizar o padrão strategy
		BigDecimal reajuste = f.getSalario().multiply(d.percentualReajuste());
					
		f.reajustarSalario(reajuste);
		
	}

}
