package br.com.glauber.exerc26;

public class MulherDeVermelho {

    private boolean acessarAMatrix;

    public boolean acessarAMatrixOn() {
        System.out.println("A mulher de vermelho está online e indo em direção ao recruta");
        return this.acessarAMatrix = true;
    }

    public void ativarCapturaDeAtencao() {

        System.out.print("A mulher passa pelo recruta, tentando atrair a sua tenção, ");
    }
}