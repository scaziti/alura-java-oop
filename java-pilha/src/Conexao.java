
public class Conexao implements AutoCloseable{
	
	public Conexao() {
		System.out.println("Abrindo Conexão");
	}
	
	public void LeDados() {
		System.out.println("Recebendo Dados");
		throw new IllegalStateException();
	}

	@Override
	public void close() {
		System.out.println("Fechando Conexão");
	}

}
