package testes.override.overload;

public class TestAnimal {

	public static void main(String[] args) {
		
		// Aqui, como minha refer�ncia � do tipo Animal(), n�o tenho acesso aos m�todos
		// Da classe Cat()
		Animal a = new Cat("Batman", "Meow");
		a.doingSomething();
		
		// J� aqui, como o tipo da ref � o mesmo do objeto, consigo acessar todos os m�todos sem problemas
		Cat b = new Cat("Lila", "Meow");
		b.doingSomenthing(1.0, 2.0);
	}
}
