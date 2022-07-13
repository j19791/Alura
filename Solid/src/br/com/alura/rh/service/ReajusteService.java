package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

//classe extraida de um método da classe Funcionario através da refatoração para melhoria da coesão: Single Responsability
public class ReajusteService {//classe extensível. Não preciso alterar outras validações qdo é alterada apenas uma das alterações

	private List<ValidacaoReajuste> validacoes;
	
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}
	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		//para cada validação, a classe vai aumentando. Separar cada regra em uma nova classe

		this.validacoes.forEach(v -> v.validar(funcionario, aumento));//executa cada uma das validações
				
		BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
	
	
}
