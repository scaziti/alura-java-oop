public class Conta{
	
	//Attributes 
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeContas;
	
	//Constructor
	public Conta(int agencia, int numero, double saldo){
		Conta.totalDeContas++;
		if (agencia <= 100) {
			System.out.println("N?mero de ag?ncia inv?lido, informe um n?mero acima de 100");
		}
		else {
			this.agencia = agencia;
		}
		
		if (numero <= 1_000) {
			System.out.println("N?mero da conta inv?lido, informe um n?mero acima de 1000");
		}
		else {
			this.numero = numero;
		}
		
		if (saldo < 0) {
			System.out.println("N?o ? poss?vel informar um saldo negativo");
		}
		else {
			this.saldo = saldo;
		}	
	}
	
	//Com o this, ao inv?s de rescrever meu construtor com as opera??es iguais, apenas chamo o que j? fiz
	public Conta(int agencia, int numero){
		this(agencia, numero, 0);
	}
	
	//Methods
	public boolean deposita(double valor){
		if (valor < 0) {
			return false;
		}
		else {
			this.saldo += valor;
			return true;
		}
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferePara(Conta destino, double valor) {
		if (this.saldo >= valor && valor > 0.0) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N?o ? permitido n?mero zero ou negativo");
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
			System.out.println("N?o ? permitido n?mero zero ou negativo");
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
	// Preciso informar que ? static, assim digo que ? um m?todo da class, n?o do object
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
}