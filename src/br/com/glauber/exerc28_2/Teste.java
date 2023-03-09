package br.com.glauber.exerc28_2;

import br.com.glauber.exerc28.Ship;

public class Teste {
    public static void main(String[] args) {

        Hovercraft2 hovercraft2 = new Hovercraft2("Cururu");

        System.out.println(hovercraft2.publicChannel1010());
        //Só posso acessar o método do Pai colocando o tipo como o filho no caso Hovercraft2
        System.out.println(hovercraft2.protectedChannel1021());

    }
}
