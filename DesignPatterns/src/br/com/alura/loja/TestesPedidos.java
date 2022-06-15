package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {
		// representa��o de uma interface c/ usu�rio
		
		//separacao : dados
		GeraPedido gerador = new GeraPedido(args[0], new BigDecimal(args[1]), Integer.parseInt(args[2]));
		
		//separacao : execu��o 
		new GeraPedidoHandler(/*dependencias*/).execute(gerador);
		
		
		
		
	}

}
