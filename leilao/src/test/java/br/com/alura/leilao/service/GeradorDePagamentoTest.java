package br.com.alura.leilao.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.alura.leilao.dao.PagamentoDao;
import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Pagamento;
import br.com.alura.leilao.model.Usuario;
import org.junit.Assert;

class GeradorDePagamentoTest {

	
	private GeradorDePagamento gerador ; 

	@Mock
	private PagamentoDao pagamentoDao;
	
	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.gerador = new GeradorDePagamento(pagamentoDao); 
	}
	
	@Captor
	private ArgumentCaptor<Pagamento> captor;
	
	@Test
	void deveriaCriarPagamentoParaVencedorDoLeilao() {
		Leilao leilao = leiloes().get(0);
		gerador.gerarPagamento(leilao.getLanceVencedor());
		
		//como recuparar um objeto que esta sendo gerado dentro da classe de testes?
		Mockito.verify(pagamentoDao).salvar(captor.capture());
		
		Pagamento pagamento = captor.getValue();
		
		org.junit.Assert.assertEquals(LocalDate.now().plusDays(1), pagamento.getVencimento());
		Assert.assertEquals(leilao.getLanceVencedor().getValor(), pagamento.getValor());
		Assert.assertFalse(pagamento.getPago());
		Assert.assertEquals(leilao.getLanceVencedor().getUsuario(), pagamento.getUsuario());
		Assert.assertEquals(leilao, pagamento.getLeilao());
	}
	
	
	  private List<Leilao> leiloes() {
	        List<Leilao> lista = new ArrayList<>();

	        Leilao leilao = new Leilao("Celular",
	                        new BigDecimal("500"),
	                        new Usuario("Fulano"));

	        Lance primeiro = new Lance(new Usuario("Beltrano"),
	                        new BigDecimal("600"));
	        Lance segundo = new Lance(new Usuario("Ciclano"),
	                        new BigDecimal("900"));

	        leilao.propoe(primeiro);
	        leilao.propoe(segundo);
	        
	        leilao.setLanceVencedor(segundo);

	        lista.add(leilao);

	        return lista;

	    }

}
