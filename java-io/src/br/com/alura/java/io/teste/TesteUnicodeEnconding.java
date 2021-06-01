package br.com.alura.java.io.teste;

import java.nio.charset.Charset;

public class TesteUnicodeEnconding {

	public static void main(String[] args) {
		
		String s = "C";
		System.out.println(s.codePointAt(0)); //67
		
		String s1 = "c";
		System.out.println(s1.codePointAt(0)); //99
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes();
		System.out.println(bytes.length);
		
	}
}
