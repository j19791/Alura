package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {
		// representação de uma interface c/ usuário
		
		//separacao : dados
		GeraPedido gerador = new GeraPedido("Rodrigo", new BigDecimal("300"), Integer.parseInt("2"));
		
		//separacao : execução: passo as ações que desejo executar na geração do pedido
		new GeraPedidoHandler(Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido()))
			.execute(gerador);
		
		
		
		
	}

}
