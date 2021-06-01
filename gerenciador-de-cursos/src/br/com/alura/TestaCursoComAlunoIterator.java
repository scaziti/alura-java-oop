package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAlunoIterator {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 24));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando Coleções", 25));
		
		Aluno a1 = new Aluno("Raphael Scaziti", 7230);
		Aluno a2 = new Aluno("Jessica Any", 7231);
		Aluno a3 = new Aluno("Batman Scaziti", 7232);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		
		while(iterator.hasNext()) {
			Aluno proximo = iterator.next();
			System.out.println(proximo);
		}
	}
}
