package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

//classe extraida de um m�todo da classe Funcionario atrav�s da refatora��o para melhoria da coes�o: Single Responsability
public class ReajusteService {//classe extens�vel. N�o preciso alterar outras valida��es qdo � alterada apenas uma das altera��es

	private List<ValidacaoReajuste> validacoes;
	
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}
	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		//para cada valida��o, a classe vai aumentando. Separar cada regra em uma nova classe

		this.validacoes.forEach(v -> v.validar(funcionario, aumento));//executa cada uma das valida��es
				
		BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
	
	
}
