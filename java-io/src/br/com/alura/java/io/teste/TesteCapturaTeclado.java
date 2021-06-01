package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCapturaTeclado {
	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com Arquivo
		InputStream fis = System.in; // new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// Fluxo de Escrita
		OutputStream fos = System.out;//new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {
			bw.write(linha); 
			bw.newLine();
			bw.flush();
			linha = br.readLine(); // Aqui testa se será null
		}

		br.close();
		bw.close();
	}

}
