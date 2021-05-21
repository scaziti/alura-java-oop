package gothanbank;

public class Conta{
	
	//Attributes 
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//Methods
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean transferePara(Conta destino, double valor) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		
		return false;
	}
}