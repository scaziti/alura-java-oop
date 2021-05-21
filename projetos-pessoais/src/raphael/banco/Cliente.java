package raphael.banco;

public class Cliente {
	
	String nome;
	String cpf;
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome do titular: " + this.nome);
		builder.append("\nNúmero CPF: " + this.cpf);
		
		return builder.toString();
	}

}
