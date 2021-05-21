
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transferePara(cp, 10.0);
		System.out.println("CP: " + String.format("R$ %.2f", cp.getSaldo()));
		System.out.println("CC: " + String.format("R$ %.2f", cc.getSaldo()));
	}
}
