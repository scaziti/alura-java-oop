package br.com.gothanbank.banco.teste;

import br.com.gothanbank.banco.modelo.*;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		try{
			cc.transferePara(cp, 10.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
		System.out.println("CP: " + String.format("R$ %.2f", cp.getSaldo()));
		System.out.println("CC: " + String.format("R$ %.2f", cc.getSaldo()));
	}
}
