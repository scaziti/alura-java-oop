import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ordenaStringsLambda2{
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		
		
		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");
		
		palavras.forEach(s -> System.out.println(s));
//		palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		palavras.sort(Comparator.comparing(String::length));
		
		palavras.forEach(s -> System.out.println(s));
	}

}

