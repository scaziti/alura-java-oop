package br.com.gothanbank.banco.teste;

public class TesteArrayString {
	public static void main(String[] args) {
		
		System.out.println("Funcionou!");
		
		/*
		 *  Para testar pelo Eclipse:
		 *  
		 *  run configurations > selecione a classe > incluo arguments > apply > run
		 *  
		 *  Senão, utilizo pelo prompt mesmo :D
		 */
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
	}

}
