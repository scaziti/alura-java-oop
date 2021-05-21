
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		// Quando crio um Objeto gerente, ser� criado um objeto AutenticacaoUtil
		this.autenticador = new AutenticacaoUtil();
	}
	
	// override / sobreposi��o
	public double getBonificacao() {
		System.out.println("Chamando bonifica��o Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	} 
}
