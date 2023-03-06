package br.com.glauber.exerc26;

public class Recruta extends Pessoas {


    @Override
    public boolean entrarNaMatrix(boolean on) {
        System.out.print("Recruta ");
        return super.entrarNaMatrix(on);
    }


    @Override
    public boolean ativarCongelamentoMatrix() {
        super.ativarCongelamentoMatrix();
        System.out.println("Recruta tentou congelar a simulação porém, ele não têm permissão para congelar ");
        return false;
    }
}