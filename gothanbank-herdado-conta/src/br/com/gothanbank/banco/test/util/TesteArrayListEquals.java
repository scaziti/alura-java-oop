package br.com.gothanbank.banco.test.util;

import java.util.ArrayList;

import br.com.gothanbank.banco.modelo.Conta;
import br.com.gothanbank.banco.modelo.ContaCorrente;
import br.com.gothanbank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(12, 10);
//		Conta cc2 = new ContaCorrente(12, 10);
//		
//		System.out.println(cc1.equals(cc2));
		
		// ArrayList com generics <> 
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(327, 1001);
		lista.add(cc1);
		Conta cc2 = new ContaCorrente(327, 1002);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(327, 1002);
		
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe? " + existe);
		
		for (Conta conta : lista) {
			if (conta.equals(cc3)) {
				System.out.println("Já tem essa conta");
			}
		}
		
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
