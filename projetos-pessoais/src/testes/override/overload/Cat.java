package testes.override.overload;

public class Cat extends Animal{

	public Cat(String name, String noise) {
		super(name, noise);
	}
	
	@Override
	protected double doingSomething() {
		System.out.println("Cat is doing somenthing");
		return 10;
	}
	
	// Overload
	protected double doingSomenthing(double x) {
		return 2;
	}
	
	protected double doingSomenthing(double x, double y) {
		return 2;
	}
}
