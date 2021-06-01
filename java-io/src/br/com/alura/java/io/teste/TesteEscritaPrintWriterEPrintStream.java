package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintWriterEPrintStream {
	public static void main(String[] args) throws IOException{
		
		
//		OutputStream fos = new FileOutputStream("loremEscritoJava.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		PrintStream ps = new PrintStream("lorem-printStream.txt");
		
		ps.println("Texto escrito pelo Eclipse, utilizando Java");
		ps.println();
		ps.print("Outra linha digitada com PrintStream");
		
		ps.close();
		
		
		PrintWriter pw = new PrintWriter("lorem-printWriter.txt");
		pw.write("Novo arquivo com printWriter");
		
		pw.close();
	}

}
