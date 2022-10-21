package br.com.alura.leilao.leiloes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.leilao.login.LoginPage;


//Apenas JUnit
public class LeiloesTest {
	
	
	
	private LeiloesPage paginaDeLeiloes; //pageObject
	private CadastroLeilaoPage paginaDeCadastro;
	
	
	@BeforeEach
	public void beforeEach() {
		//1. login
				LoginPage paginaDeLogin = new LoginPage();
				paginaDeLogin.preencheFormularioDeLogin("fulano", "pass");
				this.paginaDeLeiloes = paginaDeLogin.efetuaLogin();//2.ja é redirecionado para listagem de leilões
				
				//3. 
				this.paginaDeCadastro = paginaDeLeiloes.carregarFormulario();
	}

	
	
	@AfterEach
	public void AfterEach() {
		this.paginaDeLeiloes.fechar();
	}
	
	@Test
	public void deveriaCadastrarLeilao() {
		
		
		
		String hoje = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String nome = "Leilao do dia" + hoje;
		String valor = "500.00";
		
		
		paginaDeCadastro.cadastrarLeilao(nome, valor, hoje);
		Assert.assertTrue(paginaDeLeiloes.isLeilaoCadastrado(nome, valor, hoje));
		
		
	}
	
	
	@Test
	public void deveriaValidarCadastroDeLeilao() {
		
		paginaDeCadastro.cadastrarLeilao("", "", "");//selenium não aceita nulos. Só recebe String. Mandar String vazia
		
		//qdo ocorre erro de validação, a url fica http://localhost:8080/leiloes 
		Assert.assertFalse(paginaDeCadastro.isPaginaAtual());		
		Assert.assertTrue(paginaDeLeiloes.isPaginaAtual());
		
		//mensagens de erro visiveis na pagina ?
		Assert.assertTrue(paginaDeCadastro.isMensagensDeValidacaoVisiveis());
	}
	
}
