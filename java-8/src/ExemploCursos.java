import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
	
	@Override
	public String toString() {
		return "Curso: " + this.nome + ", Nº Alunos: " + this.alunos;
	}
}

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.forEach(c -> System.out.println(c));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		System.out.println("\nApós o sort: ");
		cursos.forEach(System.out::println);
		
		System.out.println("\nApós o stream com filter (acima de 100 alunos): ");
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		
//		Igual o de cima, mas sem Method reference!
//		cursos.stream()
//		.filter(c -> c.getAlunos() >= 100)
//		.map(c -> c.getAlunos())
//		.forEach(c -> System.out.println(c));
		
	}
}
