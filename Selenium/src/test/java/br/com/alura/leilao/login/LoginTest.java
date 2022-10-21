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


//Apenas JUnit
public class LoginTest {
	
	
	
	private LoginPage loginPage; //pageObject
	
	
	@BeforeEach
	public void beforeEach() {
		this.loginPage = new LoginPage();
	}

	@Test
	public void deveriaEfetuarLoginComDadosValidos() {
		
		
		loginPage.preencheFormularioDeLogin("fulano", "pass");
		loginPage.efetuaLogin();
		
		
		
		//teste 1
		Assert.assertFalse(loginPage.isPaginadeLogin()); //não pode estar na tela de login
		
		//teste 2
		Assert.assertEquals("fulano", loginPage.getNomeUsuarioLogado()); //verifica se o nome do usuário esta preenchido no cabeçalho da tela quando o login é bem sucedido
		
		
	}
	
	@Test
	public void naoDEveriaLogarComDadosInvalidos() {
		
		loginPage.preencheFormularioDeLogin("invalido", "pass");
		loginPage.efetuaLogin();
		
		//teste 1
				Assert.assertTrue(loginPage.isPaginadeLoginInvalido()); //deve estar na tela de login
				
				//teste 2
				Assert.assertNull("fulano", loginPage.getNomeUsuarioLogado()); //verifica se o nome do usuário esta preenchido no cabeçalho da tela quando o login é bem sucedido
				
		//teste3
		Assert.assertTrue(loginPage.contemTexto("Usuário e senha inválidos"));  
		
		
	}
	
	@Test
	public void naoDeveriaAcessarPaginaRestritaSemEstarLogado() {
		loginPage.navegaParaPaginaDeLances();
		
		
		
		
		//teste 1
		Assert.assertTrue(loginPage.isPaginadeLogin()); //deve estar na tela de login//precisa redirecidonado para tela de login
		
		Assert.assertFalse(loginPage.contemTexto("Dados do Leilão")); //não deverá conter o texto Dados do Leilão
				
		
	}
	
	@AfterEach
	public void AfterEach() {
		this.loginPage.fechar();
	}
}
