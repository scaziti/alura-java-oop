package raphael.banco;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void saca(double valor) {
		if (valor > 0) {
			if (this.saldo > valor) {
				this.saldo -= valor;
			}
			else {
				System.out.println("N?o realizado");
			}
		}
		else {
			System.out.println("N?o realizado");
		}
		
	}
	
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
		else {
			System.out.println("N?o realizado");
		}
	}
	
	public void transferePara(Conta conta, double valor) {
		if (conta != null) {
			if (this.saldo > valor) {
				this.saca(valor);
				conta.deposita(valor);
			}
		}
		else {
			System.out.println("N?o realizado");
		}
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.titular.toString());
		builder.append("\nAg?ncia: " + this.agencia);
		builder.append("\nN?mero: " + this.numero);
		builder.append("\nSaldo: R$ " + String.format("%.2f", this.saldo));
		
		return builder.toString();
	}
}
