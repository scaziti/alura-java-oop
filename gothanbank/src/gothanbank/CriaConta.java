package gothanbank;

public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.saldo = 200;
		System.out.println("Conta um: " + c1.saldo);
		
//		c1.saldo += 100;
//		System.out.println(c1.saldo);
//		
		Conta c2 = new Conta();
		c2.saldo = 500;
		System.out.println("Conta dois: " + c2.saldo);
		
	}

}
