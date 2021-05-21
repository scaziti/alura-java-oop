
public class ContaCorrente extends Conta implements Tributavel{

	//Constructor
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	 
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2; // terá uma taxa a cada saque
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	
}
