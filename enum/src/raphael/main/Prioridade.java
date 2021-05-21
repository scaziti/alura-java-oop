package raphael.main;

public enum Prioridade {

	// Já são instanciados aqui, portanto, são sim objetos
	MIN(1), NORMAL(5), MAX(10);
	
	private int valor;
	
	Prioridade(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
