package br.com.alura;

public class TestaUnmodifiableList {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es", "Paulo Silveira");
	
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Cole��es", 22));
		
		System.out.println(javaColecoes.getAulas());
	}

}
