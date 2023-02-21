package br.com.glauber.exerc24;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArtificialIntelligence {

    private List<String> decisionLog = new ArrayList<>();

    public void makeDecision(String problem) {
        var answer = decisionTree();
        decisionLog.add(problem + " -> " + answer);
    }

    private boolean decisionTree() {
        return new Random().nextBoolean();
    }

    public List<String> getDecisionLog() {
        return decisionLog;
    }
}
