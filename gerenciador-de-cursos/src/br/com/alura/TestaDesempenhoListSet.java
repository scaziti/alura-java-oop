package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaDesempenhoListSet {

	public static void main(String[] args) {
		
		
		
		List<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i < 1_000_000; i++) {
			lista.add(i);
		}
		long inicioList = System.currentTimeMillis();
		boolean tets = lista.contains(999_999);
	
		long fimList = System.currentTimeMillis();
		
		System.out.println("Tempo List: " + (fimList - inicioList) + " milissegundos");
		System.out.println("\n====================================\n");
		
		
		
		Set<Integer> listaSet = new HashSet<>();
		
		for (int i = 0; i < 1_000_000; i++) {
			listaSet.add(i);
		}
		long inicioSet = System.currentTimeMillis();
		listaSet.contains(999_999);
		
		long fimSet = System.currentTimeMillis();
		
		System.out.println("Tempo List: " + (fimSet - inicioSet) + " milissegundos");
	}
}
