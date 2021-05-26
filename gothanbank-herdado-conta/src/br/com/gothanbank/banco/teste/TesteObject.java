package br.com.gothanbank.banco.teste;

import br.com.gothanbank.banco.modelo.Cliente;
import br.com.gothanbank.banco.modelo.ContaCorrente;
import br.com.gothanbank.banco.modelo.ContaPoupanca;

public class TesteObject {
	
	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(1);
		System.out.println(false);
		
		Object cc = new ContaCorrente(11, 201);
		Object cp = new ContaPoupanca(11, 321);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
	}

}
