package br.com.glauber.exerc26.respostaprofessor;

public class SobreAbstracao {
    public static void main(String[] args) {
        // ABSTRAÇÃO => PEGAR UM CONCEITO DO MUNDO REAL E ADAPTÁ-LO PARA SOFTWARE, NA MAIORIA DAS VEZES SIMPLIFICANDO

        var matrixSimulation = new MatrixSimulation(50);
        var morpheus = new Person('M', "", "ROOT");
        var recruit = new Person('M', Person.generateRandomHairColor(), "RECRUIT");

        matrixSimulation.addPerson(morpheus);
        matrixSimulation.addPerson(recruit);

        matrixSimulation.run();
        matrixSimulation.catchRecruitAttention();

        matrixSimulation.turnCatchInAgent();

        matrixSimulation.freeze(recruit);

        matrixSimulation.freeze(morpheus);

        System.out.println();
        System.out.println("TOTAL COUNT: " + matrixSimulation.totalInSimulation());
        System.out.println("FROZEN COUNT: " + matrixSimulation.howManyFrozen());

    }
}
