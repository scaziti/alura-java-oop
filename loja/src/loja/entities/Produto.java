package loja.entities;

public class Produto {
	
	// Attributes
	private String nome;
	private double preco;
	private int quantidade;
	private int codProduto;
	
	// Constructor
	public Produto(String nome, double preco, int quantidade, int codProduto) {
		this.nome = nome;
		this.adicionaPreco(preco);
		this.adicionaProduto(quantidade);
		this.adicionaCodProduto(codProduto);
	}
	
	// Methods 
	public boolean adicionaProduto(int quantidade) {
		if (quantidade <= 0) {
			return false;
		} else {
			this.quantidade = quantidade;
			return true;
		}
	}
	
	public boolean adicionaPreco(double valor) {
		if (valor <= 0) {
			return false;
		} else {
			this.preco = valor;
			return true;
		}
	}
	
	public boolean adicionaCodProduto(int cod) {
		if (cod == this.codProduto) {
			return false;
		} else {
			this.codProduto = cod;
			return true;
		}
	}
	
	// Getters and Setters
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public int getCodProduto() {
		return this.codProduto;
	}
}
