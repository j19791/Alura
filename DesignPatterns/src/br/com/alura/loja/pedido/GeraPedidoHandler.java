package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	
	//construtor com injeção dfe dependencias: repository, service
	
	
	public void execute(GeraPedido dados) {
Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido do bd");
		System.out.println("Enviar email com dados do novo pedido");
	}
	
}
