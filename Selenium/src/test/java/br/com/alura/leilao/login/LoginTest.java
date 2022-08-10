package br.com.alura.leilao.login;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	@Test
	public void deveriaEfetuarLoginComDadosValidos() {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver browser = new ChromeDriver(); //p/ cada navegador tem uma implementação especifica
		browser.navigate().to("http://localhost:8080/login"); //abre o navegador e vai para a url especificada
		
		browser.findElement(By.id("username")).sendKeys("fulano"); //preenche o campo usuário no formulário
		browser.findElement(By.id("password")).sendKeys("pass");		
		
		browser.findElement(By.id("login-form")).submit();//submeter o form
		
		//teste 1
		Assert.assertFalse(browser.getCurrentUrl().equals("http://localhost:8080/login")); //não pode estar na tela de login
		
		//teste 2
		Assert.assertEquals("fulano", browser.findElement(By.id("usuario-logado")).getText()); //verifica se o nome do usuário esta preenchido no cabeçalho da tela quando o login é bem sucedido
		
		
		
		
		browser.quit(); //fecha o navegador
	}
}
