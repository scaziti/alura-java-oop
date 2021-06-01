package br.com.gothanbank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer intRef = Integer.valueOf(29); // autoboxing
		System.out.println(intRef.intValue()); // unboxing
		
		Double dRef = Double.valueOf(4.2); //Autoboxing
		System.out.println(dRef.doubleValue()); // unboxing
		
		Boolean bRef = Boolean.FALSE; //Autoboxing
		System.out.println(bRef.booleanValue()); //unboxing
		
		// Lembrar que char não guarda número negativo! (0 a 65536)
		char chars = 'a';
		int x = chars;
		System.out.println(x);
		
		Number refNumber = Double.valueOf(4.5);
		Number refNumber2 = Float.valueOf(28.0f);
		Number refNumber3 = Long.valueOf(10L);
		
		// Perceba que por ter um generics do tipo Number, posso incluir qualquer tipo
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(23.6);
		lista.add(4.9f);
		lista.add(10l);
	}
}
