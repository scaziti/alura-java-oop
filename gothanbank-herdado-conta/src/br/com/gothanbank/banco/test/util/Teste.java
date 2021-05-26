package br.com.gothanbank.banco.test.util;

import java.util.ArrayList;

import br.com.gothanbank.banco.modelo.Conta;
import br.com.gothanbank.banco.modelo.ContaCorrente;
import br.com.gothanbank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		// ArrayList com generics <> 
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(327, 1001);
		lista.add(cc1);
		Conta cp1 = new ContaPoupanca(327, 1002);
		lista.add(cp1);
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(1);
		System.out.println(ref.getNumero());
		
		Conta cc2 = new ContaCorrente(327, 1003);
		lista.add(cc2);
		Conta cp2 = new ContaPoupanca(327, 1004);
		lista.add(cp2);
		
		for (int i = 0; i < lista.size(); i++) {
			Conta oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("===============");
		for (Conta oRef : lista) {
			System.out.println(oRef);
		}
	}
}
