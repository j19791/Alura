package br.com.alura.forum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest //Spring inicialize o servidor e carregue os beans da aplicação durante a execução dos testes automatizados.
public class ForumApplicationTests {

	@Test
	public void contextLoads() {
		Assert.assertTrue(true);
	}

}
