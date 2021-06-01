package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		// N�o tenho garantia de qual a ordem os objetos, pois n�o � uma Lista!!!
		// N�o adiciona objetos duplicados!!
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Raphael Scaziti");
		alunos.add("Jessica Any");
		alunos.add("Batman Scaziti");
		alunos.add("Morfeu Sommerfeld");
		alunos.add("Cookie Scaziti");
		alunos.add("Crystal Sommerfeld");
		alunos.add("Lila Scaziti");
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		boolean raphaEstaMatriculado = alunos.contains("Raphael Scaziti");
		System.out.println(raphaEstaMatriculado); //true
		
		// N�o tem posi��o, como na List
		alunos.remove("Raphael Scaziti");
		
		//Tamb�m tenho a op��o de fazer o ArrayList receber cole��es
		List<String> novaLista = new ArrayList<>(alunos);
	}

}
