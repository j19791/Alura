package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Teste {

	//var nome = "jo√O"; VARIAVEL DE INSTANCIA N√O PODE FAZER INFERENCIA DE VARIAVEIS
	
	public static void main(String[] args) {
		HashMap<String, String> cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Jo„o", "04813189");

		System.out.println(cpfPorNomes);
		
		//jAVA 10 - INFERENCIA DE VARIAVEIS
		var cpfPorNomes2 = new HashMap<String, String>(); //declarar os tipos q eu quero no new
		
		var nome = "jo√O";
	}
}
