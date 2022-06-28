package br.com.alura.factorymethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
		
		//Novidades Java 9 - Factory methods
		//criando coleções imutáveis
		List<String> nomes2 = List.of("primeiroNome", "segundoNome", "terceiroNome");
		
		Set.of("quartoNome");
		
		Map.of("nome", "João");
		
		
	}
}
