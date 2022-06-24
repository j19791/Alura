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

/*O sistema deve permitir que os funcion�rios recebam um reajuste salarial anual baseado em seu desempenho, obedecendo �s seguintes regras:

Se o desempenho for classificado como "A desejar", o reajuste ser� de 3% do sal�rio atual.
Se o desempenho for "Bom,", o reajuste ser� de 15% do sal�rio.
Se o desempenho for "�timo", o reajuste ser� de 20% do sal�rio.*/

public class ReajusteServiceTest {

	
	private ReajusteService service;
	private Funcionario f;

@BeforeEach //chamar automaticamente antes de rodar todos os testes
	private void inicializar() { 		
		this.service = service = new ReajusteService();
		this.f = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
	}

@AfterEach //chama ap�s os m�todos de testes
private void finalizar() {
	System.out.println("fim");
}

@BeforeAll //chama uma vez antes de todos os m�todos
public static void antesDeTodos() {
	System.out.println("Antes de todos");
}

@AfterAll ////chama uma vez depois  de executar todos os testes
public static void depoisDeTodos() {
	System.out.println("depopis de todos");
}
	
	@Test //Cen�rio de teste 1
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
