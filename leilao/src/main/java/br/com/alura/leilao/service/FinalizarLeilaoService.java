package br.com.alura.leilao.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;

@Service
public class FinalizarLeilaoService {

	
	private LeilaoDao leiloes;//mockar
	private EnviadorDeEmails enviadorDeEmails;

	@Autowired //a dependencia devera ser passada no contrutor para que seja possível programar o teste unitário com mockito
	public FinalizarLeilaoService(LeilaoDao leiloes, EnviadorDeEmails enviadorDeEmails) {
		this.leiloes = leiloes;
		this.enviadorDeEmails = enviadorDeEmails;
	}

	public void finalizarLeiloesExpirados() {//leilao expirado é aquele q foi aberto há mais de 7 dias
		List<Leilao> expirados = leiloes.buscarLeiloesExpirados();
		expirados.forEach(leilao -> {
			Lance maiorLance = maiorLanceDadoNoLeilao(leilao);
			leilao.setLanceVencedor(maiorLance);
			leilao.fechar(); //fechado=true
			leiloes.salvar(leilao); //qdo der erro no salvar leilão, não enviar email
			enviadorDeEmails.enviarEmailVencedorLeilao(maiorLance);
		});
	}

	private Lance maiorLanceDadoNoLeilao(Leilao leilao) {
		List<Lance> lancesDoLeilao = new ArrayList<>(leilao.getLances());
		lancesDoLeilao.sort((lance1, lance2) -> {
			return lance2.getValor().compareTo(lance1.getValor());
		});
		return lancesDoLeilao.get(0);
	}
	
}
