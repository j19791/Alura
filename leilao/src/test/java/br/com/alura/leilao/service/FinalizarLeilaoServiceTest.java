package br.com.alura.leilao.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;

class FinalizarLeilaoServiceTest {

	private FinalizarLeilaoService service;
	
	@Mock //inicializa o mock
	private LeilaoDao dao ; 

	@Mock
	private EnviadorDeEmails enviadorDeEmails;
	
	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.service = new FinalizarLeilaoService(dao, enviadorDeEmails); 
	}
	
	@Test
	void deveriaFinalizarUmLeilao() {
		List<Leilao> leiloes = leiloes();
		
		Mockito.when(dao.buscarLeiloesExpirados()).thenReturn(leiloes);
		
		service.finalizarLeiloesExpirados();
		
		Leilao leilao = leiloes.get(0);
		
		Assert.assertTrue(leilao.isFechado());
		Assert.assertEquals(new BigDecimal("900"), leilao.getLanceVencedor().getValor());
		Mockito.verify(dao).salvar(leilao);
		
		
	}
	
	@Test
	void deveriaEnviarEmailpParaOVencendor() {
		List<Leilao> leiloes =  leiloes();
		
		Mockito.when(dao.buscarLeiloesExpirados()).thenReturn(leiloes);
		
		service.finalizarLeiloesExpirados();
		
		Leilao leilao = leiloes.get(0);
		
		Lance lanceVencedor = leilao.getLanceVencedor();
		
		
		Mockito.verify(enviadorDeEmails).enviarEmailVencedorLeilao(lanceVencedor);
		
		
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

        lista.add(leilao);

        return lista;

    }
    
    @Test
	void naoDeveriaEnviarEmailQuandoOcorreErroAoFinalizarUmLeilao() {
		List<Leilao> leiloes = leiloes();
		
		Mockito.when(dao.buscarLeiloesExpirados()).thenReturn(leiloes);
		
		//simular o lançamento de uma exception ao chamar o método salvar
		Mockito.when(dao.salvar(Mockito.any())).thenThrow(RuntimeException.class);
		
		try {
			service.finalizarLeiloesExpirados(); 					
			Mockito.verifyNoInteractions(enviadorDeEmails);	
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		
	}

}
