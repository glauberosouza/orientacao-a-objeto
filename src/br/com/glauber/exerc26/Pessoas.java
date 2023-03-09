package br.com.glauber.exerc26;

public class Pessoas {
    private boolean permissaoCongelar;
    private boolean onNaMatrix;



    public boolean entrarNaMatrix(boolean on) {
        System.out.println("você acaba de entrar na simulação da Matrix");
        return this.onNaMatrix = true;
    }

    public boolean ativarCongelamentoMatrix() {
        return permissaoCongelar = false;
    }
}