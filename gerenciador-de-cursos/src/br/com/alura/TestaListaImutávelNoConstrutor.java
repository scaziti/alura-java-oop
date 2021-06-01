package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaListaImutávelNoConstrutor {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
	
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));
		
		// Devido ao get com unmodifiableList, essa cópia não permite nem mesmo o sort
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		// Dessa forma, passando pelo construtor, crio uma "cópia"
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}

}
