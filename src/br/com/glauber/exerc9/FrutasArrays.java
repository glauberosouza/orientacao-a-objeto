package br.com.glauber.exerc9;

import java.util.Arrays;

public class FrutasArrays {
    public static void main(String[] args) {

        String[] frutas = new String[5];
        frutas[0] = "Manga";
        frutas[1] = "Abacate";
        frutas[2] = "Mamão";
        frutas[3] = "Uva";
        frutas[4] = "Pera";


        System.out.println(Arrays.toString(frutas));
        System.out.println();

        boolean temLetraT = false;

        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i].contains("t")) {
                temLetraT = true;
                System.out.println(frutas[i]);
            }
        }
        if (!temLetraT) {
            System.out.println("DESCULPE, NENHUMA PALAVRA COM T ENCONTRADA!");
        }
    }
}

