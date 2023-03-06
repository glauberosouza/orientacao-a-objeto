package br.com.glauber.exerc26;


import java.util.Scanner;

public class SobreAbstracao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe quantos atores estaram na simulação: ");
        int qtdDeAtores = input.nextInt();

        MatrixSimulation simulacaoDaMatrix = new MatrixSimulation(qtdDeAtores);

        //Começar a simulação
        System.out.println(simulacaoDaMatrix.ligarASimulacao(true));

        //Professor e o reccruta inseridos na matrix.
        simulacaoDaMatrix.professor.entrarNaMatrix(true);
        simulacaoDaMatrix.recruta.entrarNaMatrix(true);

        //Atores começão a se movimentar
        simulacaoDaMatrix.movimentarAtores();

        //Mulher de vermelho está na matrix
        simulacaoDaMatrix.mulherDeVermelho.acessarAMatrixOn();

        //Teste com o recruta
        simulacaoDaMatrix.executarTesteComRecruta();

        //Recruta tentando congelar a matrix
        simulacaoDaMatrix.recruta.ativarCongelamentoMatrix();
        //Professor congela a matrix porque têm permissão
        simulacaoDaMatrix.professor.ativarCongelamentoMatrix();
        //Quantidade de atores na cena
        System.out.println("A quantidade de atores que foram congelados foram: " + simulacaoDaMatrix.atores.size());

        input.close();
    }
}