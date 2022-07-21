package escola;

import java.time.LocalDateTime;

public class Indicacao {

	private Aluno indicado;
	public Aluno getIndicado() {
		return indicado;
	}

	public Aluno getIndicante() {
		return indicante;
	}

	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}

	private Aluno indicante;
	
	private LocalDateTime dataIndicacao;
	
	public Indicacao(Aluno indicado, Aluno indicante) {
		this.indicado = indicado;
		this.indicante = indicante;
		this.dataIndicacao = LocalDateTime.now();
	}
	
	
	
}
