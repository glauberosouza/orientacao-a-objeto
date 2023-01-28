package br.com.glauber.exerc14;

import java.util.ArrayList;

public class Frutas {
    public static void main(String[] args) {

        var frutas = new ArrayList<String>();
        frutas.add("Uva");
        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Pera");
        frutas.add("Melancia");

        frutas.remove(3);
        for (var fruta : frutas) {
            System.out.println("NOME DA FRUTA COM O NOME MAIUSCULO: " + fruta.toUpperCase());
        }
    }
}
