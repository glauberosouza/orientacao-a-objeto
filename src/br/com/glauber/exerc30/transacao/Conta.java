package br.com.glauber.exerc30.transacao;

public interface Conta {

    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta conta);
}