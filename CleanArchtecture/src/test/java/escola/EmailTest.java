package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
