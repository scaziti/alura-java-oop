package loja.entities;

public class Cliente extends Pessoa {
	
	private static int codCliente = 0;
	
	public Cliente(String nome, String cpf) {
		super(nome, cpf);
		codCliente++;
		
	}
	
	public static int getCodCliente() {
		return Cliente.codCliente;
	}
	
	

}
