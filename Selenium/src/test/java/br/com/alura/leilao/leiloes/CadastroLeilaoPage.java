package br.com.alura.leilao.leiloes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroLeilaoPage {

	public CadastroLeilaoPage(WebDriver browser) {
		this.browser = browser;
	}

	private WebDriver browser;

	public LeiloesPage cadastrarLeilao(String nome, String valorInicial, String dataAbertura) {
		
		browser.findElement(By.id("nome")).sendKeys(nome);
		browser.findElement(By.id("valorInicial")).sendKeys(valorInicial);
		browser.findElement(By.id("dataAbertura")).sendKeys(dataAbertura);
		browser.findElement(By.id("button-submit")).submit();
		
		return new LeiloesPage(browser); //o submit do botão send de leilões retorna para a pagina de leilões
	}
	
	
	
}
