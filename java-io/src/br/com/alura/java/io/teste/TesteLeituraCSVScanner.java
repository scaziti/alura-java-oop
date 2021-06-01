package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSVScanner {

	public static void main(String[] args) throws Exception {
		
		//Utilizo um scanner para ler o arquivo
		Scanner scan = new Scanner(new File("contas.csv"));
		
		while(scan.hasNextLine()) {
			String linha = scan.nextLine();
//			System.out.println(linha);
			
			// Depois outro para separar os valores 
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US); //Defino a região que desejo para evitar erros com pontos e virgulas
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next(); 
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt(); 
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble(); 
			
			System.out.format(new Locale("pt","BR"), "%s %04d-%06d %15s: %05.2f %n", tipoConta, agencia, numero, titular, saldo);
			
			linhaScanner.close();
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
		}
		
		
		
		scan.close();
	}
}
