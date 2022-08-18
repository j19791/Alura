package br.com.alura.leilao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {

	protected WebDriver browser; 
	
	public PageObject(WebDriver browser){
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		if(browser == null) {
			this.browser = new ChromeDriver(); //p/ cada navegador tem uma implementação especifica
		}else this.browser = browser;
	
		//tratamento para ajax e paginas assincronas muito demoradas: o selenium espera (timeout)
		this.browser.manage().timeouts()
			.implicitlyWait(5, TimeUnit.SECONDS) ////espera 5 segundos até aparecer o elemento na página (demora de carregamento de páginas)
			.pageLoadTimeout(10, TimeUnit.SECONDS); 
	
	
	}
	
	public void fechar() {
		browser.close();
		
	}

}
