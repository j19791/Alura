package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{

	public void validar(Funcionario funcionario, BigDecimal aumento) {
		//valida��o de periodicidade: um reajuste no m�ximo a cada 6 meses
				LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
				LocalDate dataAtual = LocalDate.now();		
				long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual) ;
				if(mesesDesdeUltimoReajuste  < 6) {
					throw new ValidacaoException("Intervalo entre os reajustes deve ser de no minimo 6 meses");
				}
	}
	
}
