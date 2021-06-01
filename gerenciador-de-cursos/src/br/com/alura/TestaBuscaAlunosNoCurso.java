package br.com.alura;

public class TestaBuscaAlunosNoCurso {

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
		
		System.out.println("Quem é o aluno de matrícula 7231?");
		Aluno aluno = javaColecoes.buscaMatriculado(731);
		System.out.println(" - " + aluno);
	}
}
