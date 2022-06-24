package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

/*O sistema deve permitir que os funcion�rios recebam um reajuste salarial anual baseado em seu desempenho, obedecendo �s seguintes regras:

Se o desempenho for classificado como "A desejar", o reajuste ser� de 3% do sal�rio atual.
Se o desempenho for "Bom,", o reajuste ser� de 15% do sal�rio.
Se o desempenho for "�timo", o reajuste ser� de 20% do sal�rio.*/

public class ReajusteServiceTest {

	@Test
	public void reajusteDEveriaSerde3PorCentoQdoDesempenhoADesejar() {
		
		//fazendo o rascunho 
		ReajusteService service = new ReajusteService();
		
		Funcionario f = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.concederReajuste(f, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), f.getSalario());
		
	}
	
	@Test
	public void reajuste15PorCentoDesempenhoBom() {
		
		//fazendo o rascunho 
		ReajusteService service = new ReajusteService();
		
		Funcionario f = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.concederReajuste(f, Desempenho.BOM);
		
		assertEquals(new BigDecimal("1150.00"), f.getSalario());
		
	}
	
	@Test
	public void reajuste20PorCentoDesempenhoOtimo() {
		
		//fazendo o rascunho 
		ReajusteService service = new ReajusteService();
		
		Funcionario f = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.concederReajuste(f, Desempenho.OTIMO);
		
		assertEquals(new BigDecimal("1200.00"), f.getSalario());
		
	}
	
}
