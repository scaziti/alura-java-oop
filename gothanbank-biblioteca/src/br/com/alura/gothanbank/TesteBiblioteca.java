package br.com.alura.gothanbank;

import br.com.gothanbank.banco.modelo.Conta;
import br.com.gothanbank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {
	
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 1002);
		
		c.deposita(100.0);
		System.out.println(c.getSaldo());
	}

}
