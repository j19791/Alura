package br.com.alura.leilao.login;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.alura.leilao.leiloes.LeiloesPage;

//Page Object - Apenas Selenium. Sem JUnit
public class LoginPage {

	private static final String HTTP_LOCALHOST_8080_LOGIN = "http://localhost:8080/login";
	private WebDriver browser;
	
	
	
	
	public LoginPage() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		this.browser = new ChromeDriver(); //p/ cada navegador tem uma implementação especifica
		this.browser.navigate().to(HTTP_LOCALHOST_8080_LOGIN); //abre o navegador e vai para a url especificada
	}




	public void fechar() {
		browser.close();
		
	}




	public void preencheFormularioDeLogin(String username, String senha) {
		browser.findElement(By.id("username")).sendKeys(username); //preenche o campo usuário no formulário com valor correto
		browser.findElement(By.id("password")).sendKeys(senha);		
		
		
	}




	public LeiloesPage efetuaLogin() {
		
		browser.findElement(By.id("login-form")).submit();//submeter o form;
		return new LeiloesPage(browser); //compartilha o webdriver para que vc continue na mesma página
		
	}




	public boolean isPaginadeLogin() {
		
		return browser.getCurrentUrl().equals(HTTP_LOCALHOST_8080_LOGIN);
		
	}




	public String getNomeUsuarioLogado() {
		
		try {
			return browser.findElement(By.id("usuario-logado")).getText();
		} catch (NoSuchElementException e) {			
			return null;
		}
	}




	public void navegaParaPaginaDeLances() {
		this.browser.navigate().to("http://localhost:8080/leiloes/2"); //vai tentar entrar direto na tela do leilao id 2 sem estar autenticado
		
	}




	public boolean contemTexto(String texto) {
		
		return browser.getPageSource().contains(texto);
	}




	public boolean isPaginadeLoginInvalido() {
		// TODO Auto-generated method stub
		 return browser.getCurrentUrl().equals(HTTP_LOCALHOST_8080_LOGIN + "?error");
	}


	
}
