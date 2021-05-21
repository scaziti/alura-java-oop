public abstract class Conta{
	
	//Attributes 
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeContas;
	
	//Constructor	
	public Conta(int agencia, int numero) {
		Conta.totalDeContas++;
		// System.out.println("O total de contas � " + Conta.totalDeContas);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Estou criando uma conta " + this.numero);
	}
	
	
	//Methods
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if (this.saldo >= valor && valor > 0.0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferePara(Conta destino, double valor) {
		if (this.saca(valor) && valor > 0.0) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	// Getters and Setters
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o � permitido n�mero zero ou negativo");
		}
		else {
			this.numero = numero;
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o � permitido n�mero zero ou negativo");
		}else {
			this.agencia = agencia;
		}
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	// Lembrando, posso escrever apenas totalDeContas (SEM O THIS)
	// Preciso informar que � static, assim digo que � um m�todo da class, n�o do object
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
}