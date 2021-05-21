// Contrato autenticavel
	// quem resolve implementar esse contrato, precisa implementar os métodos abstratos
	// método setSenha e autentica: concreto

public abstract interface Autenticavel {

	public void setSenha(int senha);

	// Por padrão interface é public e abstract, mesmo que não declare!!!
	boolean autentica(int senha);
	
}
