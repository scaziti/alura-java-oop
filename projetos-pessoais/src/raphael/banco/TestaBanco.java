package raphael.banco;

import java.util.Scanner;

public class TestaBanco {

	public static void main(String[] args) {
		
		Conta contaRapha = new Conta();
		contaRapha.titular = new Cliente();
		
		contaRapha.titular.nome = "Raphael Scaziti";
		contaRapha.titular.cpf = "123";
		contaRapha.agencia = 7227;
		contaRapha.numero = 1001;
		contaRapha.saldo = 80_000.00;
		
		System.out.println("Status da conta antes de alterações: " + "\n\n" + contaRapha);
		
		contaRapha.deposita(10_000);
		System.out.println("\nDepois de depositar: " + "\n\n" + contaRapha);
		
		contaRapha.saca(20_000);
		System.out.println("\nDepois de sacar: " + "\n\n" + contaRapha);
		
		Conta contaJe = new Conta();
		contaJe.titular = new Cliente();
		contaJe.titular.nome = "Jessica Any Scaziti";
		contaJe.titular.cpf = "124";
		contaJe.agencia = 7227;
		contaJe.numero = 1002;
		contaJe.saldo = 180_000.00;
		
		System.out.println("\nStatus da conta antes de alterações: " + "\n\n" + contaJe);
		
		contaRapha.transferePara(contaJe, 50_000);
		System.out.println("\nApós transferência " + "\n\n" + contaJe);
		System.out.println("\nDepois de depositar: " + "\n\n" + contaRapha);
		
	}
}
