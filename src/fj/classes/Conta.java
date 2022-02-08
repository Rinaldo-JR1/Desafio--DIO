package fj.classes;

// Classe pai

import fj.interfaces.iConta;

public abstract class Conta implements iConta {

        private static final int AGENCIA_PADRAO = 1 ;
        private static int SEQUENCIAL =1 ;

        protected int agencia;
        protected int numero;
        protected double saldo;
        protected Cliente cliente;

        public Conta(Cliente cliente) {
           this.agencia = AGENCIA_PADRAO ;
           this .numero = SEQUENCIAL++;
           this.cliente = cliente;
        }



    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(Double valor) {
                this.saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {

            this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, Double valor) {

        // da instancia que estiver chamando a transferencia
        // é sacado dinheiro
        this.sacar(valor);
        // a conta que esta recebendo transferencia
        // é depositado dinheiro
        contaDestino.depositar(valor);

    }

    protected  void imprimirAtributosConta() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
