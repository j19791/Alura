package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

	
	private HttpAdapter http;
	
	
	
	
	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}




	public void registrar(Orcamento orcamento) {
		if(! orcamento.isFinalizado()) {
			throw new DomainException("Orcamento nao finalizado"); 
		}
		
		//detalhes de infra-estrutura: chamada http para uma api externa
		//criar uma abstração para trocar implementação mais fácil
		//Map of só na Java 9
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(), 
				"quantidadeDeItens", Integer.valueOf(orcamento.getQuantidadeDeItens()));
		
		http.post("http://api.externa/orcamento", dados); //nao interessa os detgalhes de implementação http
	}
	
}
