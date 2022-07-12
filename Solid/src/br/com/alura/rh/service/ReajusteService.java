package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

//classe extraida de um m�todo da classe Funcionario atrav�s da refatora��o para melhoria da coes�o: Single Responsability
public class ReajusteService {

	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salario = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salario , RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}

		BigDecimal salarioReajustado = salario.add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
}
