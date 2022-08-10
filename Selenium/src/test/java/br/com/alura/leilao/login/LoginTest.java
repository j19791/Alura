package br.com.alura.leilao.login;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	private static final String HTTP_LOCALHOST_8080_LOGIN = "http://localhost:8080/login";
	private WebDriver browser;
	
	
	@BeforeAll
	public static void beforeAll() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	}
	
	
	@BeforeEach
	public void beforeEach() {
		this.browser = new ChromeDriver(); //p/ cada navegador tem uma implementação especifica
		this.browser.navigate().to(HTTP_LOCALHOST_8080_LOGIN); //abre o navegador e vai para a url especificada
	}

	@Test
	public void deveriaEfetuarLoginComDadosValidos() {
		
		
		
		
		browser.findElement(By.id("username")).sendKeys("fulano"); //preenche o campo usuário no formulário com valor correto
		browser.findElement(By.id("password")).sendKeys("pass");		
		
		browser.findElement(By.id("login-form")).submit();//submeter o form
		
		//teste 1
		Assert.assertFalse(browser.getCurrentUrl().equals(HTTP_LOCALHOST_8080_LOGIN)); //não pode estar na tela de login
		
		//teste 2
		Assert.assertEquals("fulano", browser.findElement(By.id("usuario-logado")).getText()); //verifica se o nome do usuário esta preenchido no cabeçalho da tela quando o login é bem sucedido
		
		
	}
	
	@Test
	public void naoDEveriaLogarComDadosInvalidos() {
		
		browser.findElement(By.id("username")).sendKeys("invalido"); //preenche o campo usuário no formulário com valor invalido
		browser.findElement(By.id("password")).sendKeys("123123");		
		
		browser.findElement(By.id("login-form")).submit();//submeter o form
		
		//teste 1
		Assert.assertTrue(browser.getCurrentUrl().equals("http://localhost:8080/login?error")); //precisa estar na tela de login
		
		//teste 2
		Assert.assertTrue( browser.getPageSource().contains("Usuário e senha inválidos.")); //verifica a mensagem de validação quando o login é mal sucedido
		
		//teste3
		Assert.assertThrows(NoSuchElementException.class, () -> browser.findElement(By.id("usuario-logado"))); //id usuario-logado não deverá existir no retorno do form com login invalido. findElement lança uma exception 
		
		
	}
	
	@Test
	public void naoDeveriaAcessarPaginaRestritaSemEstarLogado() {
		this.browser.navigate().to("http://localhost:8080/leiloes/2"); //vai tentar entrar direto na tela do leilao id 2 sem estar autenticado
		
		//teste 1
		Assert.assertTrue(browser.getCurrentUrl().equals("http://localhost:8080/login")); //precisa redirecidonado para tela de login
		
		Assert.assertFalse(browser.getPageSource().contains("Dados do Leilão")); //não deverá conter o texto Dados do Leilão
				
		
	}
	
	@AfterEach
	public void AfterEach() {
		browser.quit(); //fecha o navegador
	}
}
