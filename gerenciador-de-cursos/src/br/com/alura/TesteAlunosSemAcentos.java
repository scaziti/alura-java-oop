package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Raphael Scaziti");
		alunos.add("Jessica Any");
		alunos.add("Batman Scaziti");
		alunos.add("Morfeu Sommerfeld");
		alunos.add("Cookie Scaziti");
		alunos.add("Crystal Sommerfeld");
		alunos.add("Lila Scaziti");
		
		System.out.println("Quantos alunos: " + alunos.size());
		
		// Testando adicionar aluno repetido:
		alunos.add("Jessica Any");
		System.out.println("Quantos alunos: " + alunos.size()); // Não adc!!!
	}

}
