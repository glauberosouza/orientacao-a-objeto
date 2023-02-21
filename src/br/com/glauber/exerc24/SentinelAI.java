package br.com.glauber.exerc24;

import java.util.List;

public class SentinelAI extends ArtificialIntelligence {
    private String code;

    public SentinelAI(String code) {
        this.code = code;
    }

    @Override
    public List<String> getDecisionLog() {
        System.out.println("RETRIEVING LOG FROM IA: " + code);
        return super.getDecisionLog();
    }
}
