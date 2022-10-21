package br.com.alura.leilao.leiloes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.alura.leilao.PageObject;

//Page Object - Apenas Selenium. Sem JUnit
public class LeiloesPage extends PageObject{

	private static final String HTTP_LOCALHOST_8080_LEILOES_CADASTRO = "http://localhost:8080/leiloes/new";
	private static final String HTTP_LOCALHOST_8080_LEILOES = "http://localhost:8080/leiloes";
	
	
	
	
	
	public LeiloesPage(WebDriver browser) {
		super(browser);		
	}

	public CadastroLeilaoPage carregarFormulario() {
		browser.navigate().to(HTTP_LOCALHOST_8080_LEILOES_CADASTRO);
		return new CadastroLeilaoPage(browser);
		
	}




	public boolean isLeilaoCadastrado(String nome, String valor, String hoje) {
		
		//pegar ultimo linha da tabela (o ultimo que foi cadastrado)
		WebElement linhaDaTabela = browser.findElement(By.cssSelector("#tabela-leiloes tbody tr:last-child"));
		
		WebElement colunaNome = linhaDaTabela.findElement(By.cssSelector("td:nth-child(1)"));
		WebElement colunaDataAbertura = linhaDaTabela.findElement(By.cssSelector("td:nth-child(2)"));
		WebElement colunaValorInicial = linhaDaTabela.findElement(By.cssSelector("td:nth-child(3)"));
		
		
		
		return colunaNome.getText().equals(nome) && colunaDataAbertura.getText().equals(hoje) && colunaValorInicial.getText().equals(valor);
	}




	public boolean isPaginaAtual() {
		
		return browser.getCurrentUrl().contentEquals(HTTP_LOCALHOST_8080_LEILOES);
	}




	


	
}
