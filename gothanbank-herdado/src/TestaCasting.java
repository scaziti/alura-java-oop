
public class TestaCasting {

	public static void main(String[] args) {
		
		Funcionario f = new Gerente();
		
		Funcionario f1 = new Designer();
		
		Gerente g1 = (Gerente) f1;
		
	
//		g1.autentica(12334);
		g1.setNome("raha");
		System.out.println(g1.getNome());
	}
}
