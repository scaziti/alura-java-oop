package br.com.alura;

import java.util.Set;
import java.util.TreeSet;

public class TestaTreeSet {

	public static void main(String[] args) {
		
		Set<Recibo> recibos = new TreeSet<>();
		
		Recibo r1 = new Recibo();
		Recibo r2 = new Recibo();
		Recibo r3 = new Recibo();
		
		recibos.add(r1);
		recibos.add(r2);
		recibos.add(r3);
	}
}

class Recibo{
	
}
