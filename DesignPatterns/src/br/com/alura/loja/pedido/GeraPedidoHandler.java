package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class GeraPedidoHandler {

	
	//construtor com injeção dfe dependencias: repository, service
	
	
	public void execute(GeraPedido dados) {
Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		//perda de coesao: muitas responsabilidades: ruim de manutenção
		/*System.out.println("Salvar pedido do bd");
		System.out.println("Enviar email com dados do novo pedido");
		*/
		//classe continua crescendo com as ações, mesmo isolando elas em classes
		new EnviarEmailPedido().executar(pedido);
		new SalvarPedidoNoBancoDeDados().executar(pedido);
	}
	
}
