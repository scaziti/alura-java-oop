
// N?o posso instanciar essa classe (criar objetos), pois ? Abstract
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
		
	}
	
	// M?todo sem corpo, n?o havendo implementa??o nessa classe, apenas nas subclasses
	public abstract double getBonificacao();
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
