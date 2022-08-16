package br.com.alura.leilao.leiloes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import br.com.alura.leilao.login.LoginPage;


//Apenas JUnit
public class LeiloesTest {
	
	
	
	private LeiloesPage paginaDeLeiloes; //pageObject
	
	/*
	@BeforeEach
	public void beforeEach() {
		this.paginaDeLeiloes = new LeiloesPage();
	}
*/
	
	
	@AfterEach
	public void AfterEach() {
		this.paginaDeLeiloes.fechar();
	}
	
	@Test
	public void deveriaCadastrarLeilao() {
		
		//1. login
		LoginPage paginaDeLogin = new LoginPage();
		paginaDeLogin.preencheFormularioDeLogin("fulano", "pass");
		this.paginaDeLeiloes = paginaDeLogin.efetuaLogin();//2.ja é redirecionado para listagem de leilões
		
		//3. 
		CadastroLeilaoPage paginaDeCadastro = paginaDeLeiloes.carregarFormulario();
		
		
		
		
		
	}
}
