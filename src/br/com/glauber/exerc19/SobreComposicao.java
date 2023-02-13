package br.com.glauber.exerc19;

public class SobreComposicao {
    public static void main(String[] args) {

        var corpoHumano = new CorpoHumano();

        corpoHumano.caminhar();
        corpoHumano.cumprimentar();

        System.out.println("----------------------------------------");
        corpoHumano.composicaoDoCorpo();
        System.out.println("----------------------------------------");
    }
}
