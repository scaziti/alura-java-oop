package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.time.LocalDate;
import java.util.Date;

public class TesteLeitura {
	public static void main(String[] args) throws IOException{
		
		// Fluxo de Entrada com arquivo
		InputStream fis = new FileInputStream("lorem.txt");
		
		// Preciso dessa classe para "fazer uma ponte entre os bytes e caracteres"
		Reader isr = new InputStreamReader(fis);
		
		// E aqui eu "junto" esses caracteres
		BufferedReader br = new BufferedReader(isr);
		
		// A função retorna null quando não existe mais "texto"
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.print(linha);
			linha = br.readLine();
		}
		
		
		// O ideal é sempre fechar o Buffer (que fechará os outros acima)
		br.close();
		
	}

}
