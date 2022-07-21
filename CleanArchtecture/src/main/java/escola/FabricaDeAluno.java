package escola;

//usando o padrão de projeto Builder: montando um objeto
public class FabricaDeAluno {

	private Aluno aluno;
	
	//passo apenas String como parametros (mais fácil) e poderá ser chamado mais fácil no código
	//métodos com melhor legibilidade no seu próprio nome
	public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
		//parte mais complexa usando os news de cada parametro
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	//código mais fluído - encadeamento
	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
}
