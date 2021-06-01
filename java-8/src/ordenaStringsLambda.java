import java.util.ArrayList;
import java.util.List;

public class ordenaStringsLambda {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		
		
		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");
		
		palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.forEach(s -> System.out.println(s));
		
	}
}

