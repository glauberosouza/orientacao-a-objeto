package br.com.glauber.exerc11;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("QUANTAS PESSOAS VÃO OPINAR? ");
        var opiniaoPessoas = teclado.nextInt();
        teclado.nextLine();

        System.out.println("POR QUANTOS DIAS? ");
        var opiniaoDias = teclado.nextInt();
        teclado.nextLine();

        int[][] listaAvaliacao = new int[opiniaoPessoas][opiniaoDias];

        int total = 0;

        for (int opiniao = 0; opiniao < listaAvaliacao.length; opiniao++) {
            for (int dia = 0; dia < listaAvaliacao.length; dia++) {
                System.out.printf("INFORME A NOTA DO DIA %d DA PESSOA %d \n", dia + 1, opiniao + 1);
                listaAvaliacao[opiniao][dia] = teclado.nextInt();
                teclado.nextLine();
                total = listaAvaliacao[opiniao][dia];
            }
        }
        var media = total/(opiniaoPessoas * opiniaoDias);
        System.out.println("MÉDIAS DAS NOTAS É: " + media);
        teclado.close();
    }
}
