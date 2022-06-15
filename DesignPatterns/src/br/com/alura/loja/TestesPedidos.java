package br.com.alura.loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.Pedido;

public class TestesPedidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
		
		Pedido pedido = new Pedido(new String("Ana da Silva"), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido do bd");
		System.out.println("Enviar email com dados do novo pedido");
		
		
		
		
		
	}

}
