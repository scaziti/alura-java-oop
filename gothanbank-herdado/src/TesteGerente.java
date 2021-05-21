
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		Autenticavel ref = new Administrador();
		Autenticavel ref2 = new Cliente();
		
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Raphael Scaziti");
		g1.setCpf("360322323-00");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(String.format("R$ %.2f", g1.getSalario()));
		
		g1.setSenha(2222);
		boolean auth = g1.autentica(2222);
		System.out.println(auth);
		
		System.out.println(g1.getBonificacao());
		
	}

}
