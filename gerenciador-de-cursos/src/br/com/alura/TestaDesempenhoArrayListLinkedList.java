package br.com.alura;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TestaDesempenhoArrayListLinkedList {
	public static void main(String[] args) {
		
		long inicioA = System.currentTimeMillis();
		List<Integer> listaA = new ArrayList<>();
		
		for (int i = 0; i < 100_000; i++) {
			listaA.add(i);
		}
		
		for (int j = 0; j < listaA.size();j++) {
			listaA.remove(j);
		}
		
		long fimA = System.currentTimeMillis();
		System.out.println("Tempo de ArrayList: " + (fimA - inicioA) + " milissegundos");
		
		System.out.println("\n======================================\n");
		
		long inicioL = System.currentTimeMillis();
		
		List<Integer> listaL = new LinkedList<>();
		
		// Na inser��o n�o tem MUITA diferen�a, pois ambos tiveram 4 milissegundos
		for (int i = 0; i < 100_000; i++) {
			listaL.add(i);
		}
		
		// Por�m, na remo��o foi gritante! 
		// ArrayList: 206 Milissegundos vs 1611 milissegundos
		for (int j = 0; j < listaL.size();j++) {
			listaL.remove(j);
		}
		long fimL = System.currentTimeMillis();
		
		System.out.println("Tempo de LinkedList: " + (fimL - inicioL) + " milissegundos");
		
		System.out.println(new Date());
	}

}
