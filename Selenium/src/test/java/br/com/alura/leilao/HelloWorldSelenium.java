package br.com.alura.leilao;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class HelloWorldSelenium {

	@Test
	public void hello() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		
		//Abrir o navegador
		WebDriver browser = new ChromeDriver(); //p/ cada navegador tem uma implementação especifica
		browser.navigate().to("http://localhost:8080/leiloes"); //abre o navegador e vai para a url especificada
		browser.quit(); //fecha o navegador
	}

}
