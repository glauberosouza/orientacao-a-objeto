package br.com.glauber.exerc3;

public class SentinelaTeste {
    public static void main(String[] args) {
        Sentinela sentinelaA = new Sentinela("A25");
        Sentinela sentinelaB = new Sentinela("A26", true);
        Sentinela sentinelaC = new Sentinela();

        System.out.println("Nome da Sentinela: " + sentinelaA.nome + " Está ativo? " + sentinelaA.ativo);
        System.out.println("Nome da Sentinela: " + sentinelaB.nome + " Está ativo? " + sentinelaB.ativo);
    }
}
