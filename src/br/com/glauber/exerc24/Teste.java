package br.com.glauber.exerc24;

public class Teste {
    public static void main(String[] args) {
        ArtificialIntelligence sentinelAI = new SentinelAI("26678");
        sentinelAI.makeDecision("Você está funcional?");
        sentinelAI.makeDecision("Você vai nos destruir?");
        sentinelAI.makeDecision("Você têm certeza?");

        var answers = sentinelAI.getDecisionLog();
        for (String answer : answers) {
            System.out.println(answer);
        }
        System.out.println();
        ArtificialIntelligence harvesterAI = new HarvesterAI();
        harvesterAI.makeDecision("Você está funcional?");
        harvesterAI.makeDecision("Você pode ser chamado de mãe?");
        harvesterAI.makeDecision("Você colheu ovos hoje?");

        answers = harvesterAI.getDecisionLog();
        for (String answer : answers) {
            System.out.println(answer);
        }
    }
}