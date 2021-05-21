package loja.entities;

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	
	
	public Pessoa(String nome, String cpf) {
		this.cadastraNome(nome);
		this.cpf = cpf;
	}
	
	public boolean cadastraNome(String nome) {
		if (nome.isBlank()) {
			return false;
		} else {
			this.nome = nome;
			return true;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}

}
