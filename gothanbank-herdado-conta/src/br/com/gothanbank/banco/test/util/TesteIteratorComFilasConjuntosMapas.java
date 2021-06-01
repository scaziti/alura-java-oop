package br.com.gothanbank.banco.test.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TesteIteratorComFilasConjuntosMapas {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Raphael Scaziti");
		lista.add("Jessica Any");
		lista.add("Batman Scaziti");

		Iterator<String> iterator = lista.iterator();

		while (iterator.hasNext()) {
			// Se eu passar a lista criada, ficará em loop infinito
			System.out.println(iterator.next());
		}

		System.out.println("================================");

		Set<String> listaHash = new HashSet<>();

		listaHash.add("Raphael Scaziti");
		listaHash.add("Jessica Any");
		listaHash.add("Batman Scaziti");

		Iterator<String> iterator2 = listaHash.iterator();

		while (iterator2.hasNext()) {
			// Se eu passar a lista criada, ficará em loop infinito
			System.out.println(iterator2.next());
		}
	}

}
