package br.com.gothanbank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Batman"; // Object Literal
	
		String novoNome = nome.replace('a', 't');
		System.out.println("Replace 'a' por 't': " + novoNome);
		
		String sub = nome.substring(0, 2); // Ba
		System.out.println("Substring: " + sub);
		
		int posicao = nome.indexOf('a');
		System.out.println("IndexOf: " + posicao);
		
		int tamanho = nome.length();
		System.out.println("Length: " + tamanho);
		
		System.out.println("Imprimindo cada char, utilizando o length:");
		for (int i = 0; i < nome.length(); i++) {
			System.out.print(nome.charAt(i) + " ");
		}
		
		System.out.println("\nisEmpty: " + nome.isEmpty());
		
		String nome2 = "    Raphael       ";
		String remove = nome2.trim();
		System.out.println("Trim: " + remove);
		
		System.out.println("Contains \"at\": " + nome.contains("at"));
	}
}
