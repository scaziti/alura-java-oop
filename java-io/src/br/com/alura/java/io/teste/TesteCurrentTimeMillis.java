package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteCurrentTimeMillis {
	public static void main(String[] args) throws IOException {
		
		long inicio = System.currentTimeMillis();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("currentTimeMilles.txt"));
		
		bw.write("Inicio do arquivo, onde escrevo qualquer coisa para testar o currentTimeMilles()");
		bw.newLine();
		bw.write("Segunda linha de texto!");
		bw.close();
		
		long fim = System.currentTimeMillis();
		
		long total = fim - inicio;
		
		System.out.println("Tempo decorrido: " + total + " milissegundos");
		
		
		
	}

}
