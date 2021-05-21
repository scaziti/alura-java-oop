
public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto c = new CalculadorDeImposto();
		c.registra(cc);
		c.registra(seguro);
		
		System.out.println(c.getTotalImposto());
	}
}
