package br.com.alura.escola.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailComEnderecoInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("invalido"));
	}
	
	@Test
	void DeveriaCriarEmailComEnderecoInvalido() {
		Email e = new Email("joao@gmail.com");
		assertEquals("joao@gmail.com", e.getEndereco());
		
	}

}
