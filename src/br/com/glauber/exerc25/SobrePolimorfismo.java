package br.com.glauber.exerc25;

import br.com.glauber.exerc24.ArtificialIntelligence;
import br.com.glauber.exerc24.HarvesterAI;
import br.com.glauber.exerc24.SentinelAI;

public class SobrePolimorfismo {

    public static void main(String[] args) {

        ArtificialIntelligence sentinelAI = new SentinelAI("3456");
        sentinelAI.makeDecision("Você está ativa? ");
        System.out.println(sentinelAI.getDecisionLog().get(0));

        ArtificialIntelligence harvesterAI = new HarvesterAI();
        harvesterAI.makeDecision("Você não está ativa? ");
        System.out.println(harvesterAI.getDecisionLog().get(0));
    }
}
