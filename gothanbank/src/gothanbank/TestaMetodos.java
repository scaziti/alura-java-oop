package gothanbank;

public class TestaMetodos {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.saldo = 100;
		c1.deposita(50);
		
		System.out.println(c1.saldo);
		
		if(c1.saca(10)) {
			System.out.println("Saque realizado com sucesso");
			System.out.println("saldo atual: R$ " + c1.saldo);
		}
		else {
			System.out.println("Saldo insulficiente");
			System.out.println("saldo atual: R$ " + c1.saldo);
		}
		
		// divisão das operações
		System.out.println("====================");
		Conta c2 = new Conta();
		c2.deposita(1000);
		
		if(c2.transferePara(c1, 1500)) {
			System.out.println("Novo saldo de c1: R$ " + c1.saldo);
			System.out.println("Novo saldo de c2: R$ " + c2.saldo);
		}
		else {
			System.out.println("Saldo insulficiente");
			System.out.println("Saldo de c1: R$ " + c1.saldo);
			System.out.println("Saldo de c2: R$ " + c2.saldo);
		}
		
	}
}
