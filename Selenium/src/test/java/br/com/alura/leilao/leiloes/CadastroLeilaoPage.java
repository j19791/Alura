package br.com.alura.leilao.leiloes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroLeilaoPage {
	
	private static final String HTTP_LOCALHOST_8080_LEILOES_CADASTRO = "http://localhost:8080/leiloes/new";

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

	public boolean isPaginaAtual() {
		
		return browser.getCurrentUrl().contentEquals(HTTP_LOCALHOST_8080_LEILOES_CADASTRO);
	}

	public boolean isMensagensDeValidacaoVisiveis() {
		String pageSource = browser.getPageSource();
		return pageSource.contains("minimo 3 caracteres") 
				&& pageSource.contains("não deve estar em branco")
				&& pageSource.contains("deve ser um valor maior de 0.1")
				&& pageSource.contains("deve ser uma data no formato dd/MM/yyyy") ;
	}
	
	
	
}
