
public class TestaValores {
	
	public static void main(String[] args) {	
		Conta conta = new Conta(7237, 1001);
		Conta conta2 = new Conta(7623, 1002);
		
		System.out.println(Conta.getTotalDeContas());
		
		Conta conta3 = new Conta(1, 1001);
		System.out.println(conta3.getAgencia());
	}

}
