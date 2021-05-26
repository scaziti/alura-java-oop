package br.com.gothanbank.banco.teste;

public class TesteArrayPrimitivoPessoal {
	
	// J� inicializa com valor padr�o, nesse caso: int = 0
	int[] idades = new int[5];
	
	int num;
	
	public static void main(String[] args) {
		
		TesteArrayPrimitivoPessoal t = new TesteArrayPrimitivoPessoal();
		
		// S� fiz assim para lembrar que � poss�vel um for dessa forma! ;D
		int x = 0;
		
		for (; x < t.idades.length; x++) {
			t.idades[x] = x + 10;
		}
		
		for (int y : t.idades) {
			System.out.print(y + " ");
		}
		
		
		System.out.println("\n" + t.idades.length);
		System.out.println(t.toString());
		System.out.println(t.idades.hashCode());
		
		// Tamb�m posso criar de forma literal!
		int[] novoArray = {1,2,3,4};
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int x : this.idades) {
			builder.append(x + " ");
		}
		builder.append("]");
		
		return builder.toString();
	}

}
