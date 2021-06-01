package br.com.gothanbank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteLambda {
	public static void main(String[] args) {
		
		System.out.println("Imprime todos os elementos da lista");
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		
		// Aqui utiliza, ao inv�s de um enhancedFor, uma express�o lambda
		lista.forEach(n -> System.out.print(n + " "));
		
		System.out.println("\n\nApenas n�meros pares: ");
		// Tamb�m posso comparar e imprimir apenas os pares
		lista.forEach(n ->{
			if(n % 2 == 0) {
				System.out.print(n + " ");
			}
		});
		
		System.out.println("\n\nImprime todos os n�meros elevados ao quadrado:");
		lista.forEach(n -> System.out.print(Math.pow(n, 2)+ " "));
	}

}
