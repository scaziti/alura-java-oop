package raphael.main;

public enum Prioridade {

	// J? s?o instanciados aqui, portanto, s?o sim objetos
	MIN(1), NORMAL(5), MAX(10);
	
	private int valor;
	
	Prioridade(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
