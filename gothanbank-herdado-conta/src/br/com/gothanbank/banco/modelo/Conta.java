package br.com.gothanbank.banco.modelo;

/**
 * Classe para representa��o de uma conta banc�ria
 * 
 * @author Raphael Scaziti
 * @version 0.1
 *
 */


public abstract class Conta implements Comparable<Conta>{
	
	//Attributes 
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeContas;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.totalDeContas++;
		// System.out.println("O total de contas � " + Conta.totalDeContas);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Estou criando uma conta " + this.numero);
	}
	
	
	//Methods
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException{
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);	
		}
		this.saldo -= valor;
	}
	
	public void transferePara(Conta destino, double valor) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);	
		
	}
	
	@Override
	public boolean equals(Object ref) {
		
		// Como o m�todo original recebe um Object, preciso fazer um cast de conta
		Conta outraConta = (Conta) ref;
		
		// Pois na Classe Object, n�o existe esses parametros
		if (this.agencia != outraConta.agencia) {
			return false;
		}
		
		if (this.numero != outraConta.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Titular: " + this.titular.getNome() + "\t, N�: " + this.numero + ", Ag: " + this.agencia + ", Saldo R$ " + this.saldo);
		return builder.toString();
	}
	
	@Override
	public int compareTo(Conta outra) {
		
		return Double.compare(this.saldo, outra.saldo);
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