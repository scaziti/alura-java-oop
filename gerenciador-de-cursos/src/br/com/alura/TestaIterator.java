package br.com.alura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestaIterator {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Raphael");
		nomes.add("Jessica");
		nomes.add("Batman");
		
		Iterator<String> iterator = nomes.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
