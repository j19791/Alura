package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.pedido.GeraPedido;

public class TestesPedidos {

	public static void main(String[] args) {
		// representação de uma interface c/ usuário
		//linha de comando
		new GeraPedido(args[0], new BigDecimal(args[1]), Integer.parseInt(args[2])).executa();
		
		
		
		
	}

}
