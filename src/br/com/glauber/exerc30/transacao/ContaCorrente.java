package br.com.glauber.exerc30.transacao;

public class ContaCorrente implements Conta{

    private double saldo;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if(valor > saldo){
            System.out.println("Valor inválido, saque maior que o seu saldo " + " Saldo Atual:" + saldo);
        }else {
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso: " + this.saldo);
        }
    }

    @Override
    public void depositar(double valor) {
        if(valor <= 0 ){
            System.out.println("Valor de deposito inválido: " + " Saldo Atual:" + saldo);
        }else{
            saldo += valor;
        }
    }

    @Override
    public void transferir(double valor, Conta conta) {
        if(saldo < valor){
            System.out.println("Valor insuficiênte para a transferência " + " Saldo Atual:" + saldo);
            return;
        }
        saldo -= valor;
        conta.depositar(valor);
    }
}