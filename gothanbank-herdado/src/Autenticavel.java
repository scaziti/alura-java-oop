// Contrato autenticavel
	// quem resolve implementar esse contrato, precisa implementar os m�todos abstratos
	// m�todo setSenha e autentica: concreto

public abstract interface Autenticavel {

	public void setSenha(int senha);

	// Por padr�o interface � public e abstract, mesmo que n�o declare!!!
	boolean autentica(int senha);
	
}
