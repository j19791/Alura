package br.com.alura.leilao.leiloes;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Page Object - Apenas Selenium. Sem JUnit
public class LeiloesPage {

	private static final String HTTP_LOCALHOST_8080_LEILOES_CADASTRO = "http://localhost:8080/leiloes/new";
	private WebDriver browser;
	
	
	
	
	public LeiloesPage(WebDriver browser) {
		
		this.browser = browser;
		//this.browser.navigate().to(HTTP_LOCALHOST_8080_LEILOES); //a navegação ja foi feita no LoginPage
	}




	public void fechar() {
		browser.close();
		
	}




	public CadastroLeilaoPage carregarFormulario() {
		browser.navigate().to(HTTP_LOCALHOST_8080_LEILOES_CADASTRO);
		return new CadastroLeilaoPage(browser);
		
	}




	


	
}
