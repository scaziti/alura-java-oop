package br.com.gothanbank.banco.test.util;

public class TesteInteger {
	public static void main(String[] args) {
		
		int x = 10;
		// Passo um primitivo no m�todo valueOf
		Integer intRef = Integer.valueOf(x); 
		
		// retorna o valor do primitivo que passei
		System.out.println(intRef.intValue());
		
		
		String str = "10";
		Integer num = Integer.valueOf(str);
		System.out.println(num + 2);
		System.out.println(num.doubleValue());
		
		int num2 = Integer.parseInt(str);
		System.out.println("int: " + num2);
		
		System.out.println("Integer size: " + Integer.SIZE + " bits");
		System.out.println("Integer Max_value: " + Integer.MAX_VALUE);
		System.out.println("Integer Bytes: " + Integer.BYTES + " (1 byte = 8 bits)");
		
		// Converter um String para int, posso sempre utilizar valueOf() ou parseInt()
		// Por�m, o valueOf() retorna uma refer�ncia, sendo necess�rio unboxing
		// J� o parseInt() retorna um primitivo direto
	}

}
