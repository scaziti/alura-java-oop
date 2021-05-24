
public class TestaSaca {
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(723, 1001);
		
		// Saca normalmente
		cc.deposita(200.0);
		
		try{
			cc.saca(100.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
		
		System.out.println(cc.getSaldo());
		
		// Ocorrerá uma Exception de saldoInsuficiente
		try{
			cc.saca(200.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
		
		System.out.println(cc.getSaldo());
	}

}
