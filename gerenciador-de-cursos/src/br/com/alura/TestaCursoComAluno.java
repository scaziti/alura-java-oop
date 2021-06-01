package br.com.alura;

public class TestaCursoComAluno {
	
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
		javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
		
		Aluno a4 = new Aluno("Raphael Scaziti",	31313);
		System.out.println("Aluno a1 equals a2?" );
		System.out.println(a1.equals(a4));
		
		System.out.println("Raphael Scaziti, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a4));
		
		System.out.println(a1.hashCode() == a4.hashCode());
	}

}
