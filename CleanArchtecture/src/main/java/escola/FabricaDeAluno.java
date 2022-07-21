package escola;

//usando o padr�o de projeto Builder: montando um objeto
public class FabricaDeAluno {

	private Aluno aluno;
	
	//passo apenas String como parametros (mais f�cil) e poder� ser chamado mais f�cil no c�digo
	//m�todos com melhor legibilidade no seu pr�prio nome
	public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
		//parte mais complexa usando os news de cada parametro
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	//c�digo mais flu�do - encadeamento
	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
}
