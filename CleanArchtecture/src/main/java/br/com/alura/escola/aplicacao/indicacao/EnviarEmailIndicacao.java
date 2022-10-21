package br.com.alura.escola.aplicacao.indicacao;

import br.com.alura.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {//disparo de e-mail infra

	void enviarPara(Aluno indicado);
	
}
