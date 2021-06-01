package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Lista de Objetos", 18);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println("Antes do sort: ");
		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println("\nDepois do sort (Comparable): ");
		Collections.sort(aulas);
		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println("\nDepois do sort (Comparator): ");
		aulas.sort(Comparator.comparing(Aula::getTempo));
		aulas.forEach(aula -> System.out.println(aula));
		
	}
}
