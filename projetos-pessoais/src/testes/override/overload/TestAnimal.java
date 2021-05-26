package testes.override.overload;

public class TestAnimal {

	public static void main(String[] args) {
		
		// Aqui, como minha referência é do tipo Animal(), não tenho acesso aos métodos
		// Da classe Cat()
		Animal a = new Cat("Batman", "Meow");
		a.doingSomething();
		
		// Já aqui, como o tipo da ref é o mesmo do objeto, consigo acessar todos os métodos sem problemas
		Cat b = new Cat("Lila", "Meow");
		b.doingSomenthing(1.0, 2.0);
	}
}
