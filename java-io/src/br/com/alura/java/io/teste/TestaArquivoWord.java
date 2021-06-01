package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaArquivoWord {
	public static void main(String[] args) throws IOException{
		
		// Fluxo de leitura de arquivo
		InputStream fis = new FileInputStream("Lorem-teste.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String info = br.readLine();
		
		while (info != null) {
			System.out.println(info);
			info = br.readLine();
		}
		
		br.close();
	}

}
