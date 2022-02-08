package fj.interfaces;

import fj.classes.Conta;

public interface iConta {

    // assinatura de sacar e depositar -> tem que ser indicado o valor a ser movimentado
    void sacar( Double valor);
    void depositar(Double valor);

    // assinatura de transferir -> tem que ser indicado o valor a ser movimentado
    // e para qual conta
    void transferir(Conta contaDestino, Double valor);

    void imprimirExtrato();

}
