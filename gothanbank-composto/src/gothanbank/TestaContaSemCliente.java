package gothanbank;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaJessica = new Conta();
		
		contaDaJessica.titular.nome = "Jessica";
		//Exception NullPointerException
		System.out.println(contaDaJessica.titular.nome);
		
		// Agora atribuo um novo objeto para variável contaDaJessica
		contaDaJessica.titular = new Cliente();
		System.out.println(contaDaJessica.titular);
	}
}
