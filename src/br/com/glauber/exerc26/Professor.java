package br.com.glauber.exerc26;

public class Professor extends Pessoas {


    @Override
    public boolean entrarNaMatrix(boolean on) {
        System.out.print("Professor ");
        return super.entrarNaMatrix(true);
    }

    @Override
    public boolean ativarCongelamentoMatrix() {
        super.ativarCongelamentoMatrix();
        System.out.println("Permissão concedida ao Professor - Matrix congelada!");
        return true;
    }
}