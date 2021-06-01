package br.com.gothanbank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.gothanbank.banco.modelo.Cliente;
import br.com.gothanbank.banco.modelo.Conta;
import br.com.gothanbank.banco.modelo.ContaCorrente;

public class TesteDesafioCollections {
	
	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(7237, 1001);
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Raphael Scaziti");
		cc1.setTitular(cliente1);
		cc1.deposita(1_000.0);
		
		Conta cc2 = new ContaCorrente(7237,1002);
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Jessica Any");
		cc2.setTitular(cliente2);
		cc2.deposita(3_000.0);
		
		Conta cc3 = new ContaCorrente(7237,1003);
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Batman Scaziti");
		cc3.setTitular(cliente3);
		cc3.deposita(5_000.0);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		
		System.out.println("Lista na ordem de inserção: ");
		for (Conta contas : lista) {
			System.out.println(contas);
		}
		
		Collections.reverse(lista);
		System.out.println("\nLista invertida: ");
		for (Conta contas : lista) {
			System.out.println(contas);
		}
		
		Collections.shuffle(lista);
		System.out.println("\nLista embaralhada: ");
		for (Conta contas : lista) {
			System.out.println(contas);
		}
		
		Collections.rotate(lista, 0);
		System.out.println("\nLista rotacionada: ");
		for (Conta contas : lista) {
			System.out.println(contas);
		}
		
	}

}
