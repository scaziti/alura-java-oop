package br.com.alura;

import java.util.function.Function;

public class TestaMethodReference {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Raphael" , 1211);
		
		Function<Aluno, String> fun = Aluno::getNome;
		
		System.out.println(fun);
	}
}
