package br.com.alura.http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class TesteRequestHttp2 {

	// Novidades do Java 11 - HTTP/2 Client API.
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		HttpClient httpClient = HttpClient.newHttpClient(); //factory method
		HttpRequest httpRequest = HttpRequest.newBuilder(new URI("https://www.casadocodigo.com.br")).GET().build(); //construir uma requisição
		HttpResponse<String> resp = httpClient.send(httpRequest, BodyHandlers.ofString());//devolve uma resposta

		System.out.println(resp.statusCode());
		System.out.println(resp.body());
		System.out.println(resp.version());

	}
}
