package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		
		//vai falhar se usar assertequals pois agora a implementação lança exception
		assertThrows(IllegalArgumentException.class, () ->  service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000") )));
		
		
		
		
	}
	
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500") ));
		
		assertEquals(new BigDecimal("250.0"), bonus);
		
	}

	@Test
	void bonusDeveriaSer10PorCentroParaSalarioDeExatamento10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000") ));
		
		assertEquals(new BigDecimal("1000.0"), bonus);
		
	}
	
}
