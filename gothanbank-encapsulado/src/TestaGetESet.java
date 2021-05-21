
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(7237, 1001);
		conta.setNumero(1001);
		System.out.println(conta.getNumero());
		
		Cliente rapha = new Cliente();
		
		rapha.setNome("Raphael Scaziti");
		conta.setTitular(rapha);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Developer");
		System.out.println(conta.getTitular().getProfissao());
		
		//Posso fazer assim também:
		Cliente c1 = conta.getTitular();
		c1.setCpf("123");
		System.out.println(c1.getNome());
		
		// note que todos apontam para mesma referência
		System.out.println(c1);
		System.out.println(rapha);
		System.out.println(conta.getTitular());
	}
}
