package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException{
		
		
//		OutputStream fos = new FileOutputStream("loremEscritoJava.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		FileWriter fw = new FileWriter("loremEscritoJava.txt");
		
		fw.write("Texto escrito pelo Eclipse, utilizando Java");
		// segue o mesmo principio do \n, porém, acaba valendo para qualquer sistema operacional sem erros
		fw.write(System.lineSeparator());
		fw.write("Outra linha digitada após um fw.newLine()");
		fw.close();
		
		// Posso utilizar o bufferdWriter junto
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem-test.txt"));
		bw.write("Escrito através de um FileWriter +  BufferedWriter 2 ");
		bw.close();
		
	}

}
