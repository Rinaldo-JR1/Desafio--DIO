package fj.controle;

import fj.classes.Cliente;
import fj.classes.Conta;
import fj.classes.ContaCorrente;
import fj.classes.ContaPoupanca;

public class DigitalOneBank {
	public static void main(String[] args) {
		// criar cliente
		Cliente novoCliente = new Cliente();
		novoCliente.setNome("Fábio José");

		// usando polimorfismo
		// pode usar referencia como Conta ou ContaCorrente e/ou ContaPoupanca
		// para instanciar ( criar ) as contas .
		// ContaCorrente cc = new ContaCorrente();

		// indicar nome do cliente
		Conta cc = new ContaCorrente(novoCliente);
		Conta cp = new ContaPoupanca(novoCliente);

		// depositar na cc
		cc.depositar(100.0);

		// impimir extratos
		cc.imprimirExtrato();
		cp.imprimirExtrato();

		// transferir para a poupança
		// se olharmos o metodo transferir espera uma Conta
		// mas ele entende de Conta e ContaPoupanca são contas e aceita o ação
		// Polimorfismo
		cc.transferir(cp, 100.0);

		// impimir extratos
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}
}
