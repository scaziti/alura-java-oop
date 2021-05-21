package loja.application;

import loja.entities.Cliente;

public class TestaCliente {
	public static void main(String[] args) {
		
		Cliente c = new Cliente("Raphael Scaziti", "360.582.948-19");
		Cliente d = new Cliente("Raphael Scaziti", "360.582.948-19");
		Cliente e = new Cliente("Raphael Scaziti", "360.582.948-19");
		
		
		System.out.println(c.getNome());
		
		System.out.println(Cliente.getCodCliente());
		
	}

}
