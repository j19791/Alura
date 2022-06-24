package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

/*O sistema deve permitir que os funcionários recebam um reajuste salarial anual baseado em seu desempenho, obedecendo às seguintes regras:

Se o desempenho for classificado como "A desejar", o reajuste será de 3% do salário atual.
Se o desempenho for "Bom,", o reajuste será de 15% do salário.
Se o desempenho for "Ótimo", o reajuste será de 20% do salário.*/

public class ReajusteServiceTest {

	
	private ReajusteService service;
	private Funcionario f;

@BeforeEach //chamar automaticamente antes de rodar todos os testes
	private void inicializar() { 		
		this.service = service = new ReajusteService();
		this.f = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
	}

@AfterEach //chama após os métodos de testes
private void finalizar() {
	System.out.println("fim");
}

@BeforeAll //chama uma vez antes de todos os métodos
public static void antesDeTodos() {
	System.out.println("Antes de todos");
}

@AfterAll ////chama uma vez depois  de executar todos os testes
public static void depoisDeTodos() {
	System.out.println("depopis de todos");
}
	
	@Test //Cenário de teste 1
	public void reajusteDEveriaSerde3PorCentoQdoDesempenhoADesejar() {	
		
		service.concederReajuste(f, Desempenho.A_DESEJAR);		
		assertEquals(new BigDecimal("1030.00"), f.getSalario());		
	}

	
	@Test
	public void reajuste15PorCentoDesempenhoBom() {	
	
		service.concederReajuste(f, Desempenho.BOM);		
		assertEquals(new BigDecimal("1150.00"), f.getSalario());
		
	}
	
	@Test
	public void reajuste20PorCentoDesempenhoOtimo() {
		
	
		service.concederReajuste(f, Desempenho.OTIMO);		
		assertEquals(new BigDecimal("1200.00"), f.getSalario());
		
	}
	
}
