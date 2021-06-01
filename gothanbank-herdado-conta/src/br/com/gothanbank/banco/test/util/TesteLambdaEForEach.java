package br.com.gothanbank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.gothanbank.banco.modelo.Cliente;
import br.com.gothanbank.banco.modelo.Conta;
import br.com.gothanbank.banco.modelo.ContaCorrente;
import br.com.gothanbank.banco.modelo.ContaPoupanca;

public class TesteLambdaEForEach {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		Conta cc5 = new ContaPoupanca(22, 23);
		Cliente clienteCC5 = new Cliente();
		clienteCC5.setNome("ana");
		cc5.setTitular(clienteCC5);
		cc5.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		lista.add(cc5);

		System.out.println("Ordem de inserção: ");
		for (Conta conta : lista) {
			System.out.println(conta);
		}

		// A mesma operação da classe anonima, porém, com Lambda
		lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		
		// Repare que faço o laço utilizando a própria lista
		// Realizando uma classe anonima com Consumer ou a expressao lambda abaixo
		// Onde uma lista<Conta> recebe um objeto do tipo conta e percorre todos os elementos printando
		System.out.println("\nForEach com lambda: ");
		lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));
		
		// Lambda com mais de uma linha de comando, preciso manter as chaves
		// Caso não informe o retorno, será um void
		lista.sort((Conta c1, Conta c2) -> {
				String nomeC1 = c1.getTitular().getNome();
				String nomeC2 = c2.getTitular().getNome();
				return nomeC1.compareTo(nomeC2);
		});
		
		System.out.println("\nForEach com classe anônima: ");
		// Fazendo um forEach com classe anonima, ficando muito mais verboso que Lambda
		lista.forEach(new Consumer<Conta>() {
			@Override
			public void accept(Conta conta) {
				System.out.println(conta + ", " + conta.getTitular().getNome());
			}
		});
		
	}
}



