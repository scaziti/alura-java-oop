package gothanbank;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		c1.saldo = 300;
		System.out.println("Saldo c1: R$ " + c1.saldo);
		
		Conta c2 = c1;
		System.out.println("Saldo c2: R$ " + c2.saldo);
	
		c2.saldo += 100;
		System.out.println("Saldo c1: R$ " + c1.saldo);
		
	}
}
