package loja.application;

import loja.entities.Produto;

public class TestaProduto {
	public static void main(String[] args) {
		
		Produto p = new Produto("RTX 3050", 12_000.0, 10, 1);
		
		System.out.println(p.getNome());
		System.out.println(p.getPreco());
		System.out.println(p.getQuantidade());
		
		p.adicionaPreco(100.0);
		p.adicionaProduto(2);
		
		System.out.println(p.getNome());
		System.out.println(p.getPreco());
		System.out.println(p.getQuantidade());
		
		System.out.println(p.getCodProduto());
		
		Produto p1 = new Produto("RTS", 100, 10, 1);
		System.out.println(p1.getCodProduto());
	}

}
