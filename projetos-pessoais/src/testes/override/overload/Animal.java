package testes.override.overload;

public class Animal {
	
	private String name;
	private String noise;
	
	public Animal(String name, String noise) {
		this.name = name;
		this.noise = noise;
	}
	
	// Methods
	protected double doingSomething() {
		System.out.println("Animal is doing somenthing");
		return 2;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNoise() {
		return noise;
	}
	
	public void setNoise(String noise) {
		this.noise = noise;
	}

}
