
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario raphael = new Gerente();
		
		raphael.setCpf("222222-2");
		raphael.setNome("Raphael Scaziti");
		raphael.setSalario(3_850.00);
		
		System.out.println(raphael.getNome());
		System.out.println(raphael.getBonificacao());
	}
}
