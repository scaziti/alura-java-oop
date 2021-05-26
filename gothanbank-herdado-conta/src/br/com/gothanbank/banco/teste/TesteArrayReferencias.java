package br.com.gothanbank.banco.teste;

import br.com.gothanbank.banco.modelo.Cliente;
import br.com.gothanbank.banco.modelo.Conta;
import br.com.gothanbank.banco.modelo.ContaCorrente;
import br.com.gothanbank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		// Aqui guardar� as refer�ncias dos meus objetos especificados
		// Se eu imprimir apenas isso, ser� por padr�o null
		// Por ter usado um tipo muito gen�rico (Object), posso guardar qualquer tipo
		Object[] referencias = new Object[5];

		// Aqui fa�o a posi��o 0 guardar a refer�ncia da cc1. Portanto, apontam para o
		// mesmo objeto
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;

		ContaPoupanca cc2 = new ContaPoupanca(22, 12);
		referencias[1] = cc2;

		ContaCorrente cc3 = new ContaCorrente(22, 13);
		referencias[2] = cc3;

		// Por ser Object, posso guardar inclusive Cliente()
		Cliente cliente = new Cliente();
		referencias[3] = cliente;

		// Preciso fazer esse cast expl�cito para compilar
		// Onde eu pego contas (object) e refencio para classe do tipo Conta (que possui
		// o m�todo deposita)
		((Conta) referencias[0]).deposita(1000.0);

		for (Object x : referencias) {
			if (x != null) {
				System.out.println(x);
			}
		}

		// Aqui tenho cc2, contas[1] e ref apontando para o mesmo objeto de
		// ContaPoupanca
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println("ref: " + ref.getNumero());
		System.out.println("cc2: " + cc2.getNumero());
		// o cast vale aqui tamb�m!
		System.out.println("contas[1]: " + ((Conta) referencias[1]).getNumero());

	}

}
