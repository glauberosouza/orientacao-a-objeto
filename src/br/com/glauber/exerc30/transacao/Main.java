package br.com.glauber.exerc30.transacao;

public class Main {
    public static void main(String[] args) {
        var contaCorrente = new ContaCorrente(100);
        var contaPoupanca = new ContaPoupanca(100);


        contaCorrente.sacar(200);
        contaCorrente.transferir(300, contaPoupanca);

    }
}