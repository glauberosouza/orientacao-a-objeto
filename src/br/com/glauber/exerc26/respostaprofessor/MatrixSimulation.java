package br.com.glauber.exerc26.respostaprofessor;

import java.util.ArrayList;
import java.util.List;

public class MatrixSimulation {
    int numberOfExtraActors;
    List<Humanoid> people = new ArrayList<>();

    public MatrixSimulation(int numberOfExtraActors) {
        this.numberOfExtraActors = numberOfExtraActors;
    }

    public void run() {
        System.out.println("INITIATING...");
        System.out.println("GENERATING ACTORS...");
        this.generateExtraActors();
        System.out.println("DONE! STARTING NOW...");
    }

    private void generateExtraActors() {
        for (var i = 0; i < this.numberOfExtraActors; i++) {
            people.add(Person.generateRandomPerson());
        }

        people.add(new WomanInTheRedDress());
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public void catchRecruitAttention() {
        for (var person : people) {
            if (person instanceof WomanInTheRedDress) {
                ((WomanInTheRedDress) person).catchAttention();
            }
        }
    }

    public void turnCatchInAgent() {
        for (var person : people) {
            if (person instanceof WomanInTheRedDress) {
                person.turnIntoAgent();
            }
        }
    }

    public void freeze(Person caller) {
        if (!caller.accessLevel.equals("ROOT")) {
            System.out.println("NOT SUFFICIENT PRIVILEGE!");
            return;
        }

        for (var person : people) {
            person.freeze();
        }

        System.out.println("ALL ACTORS WERE FROZEN!");
    }

    public int howManyFrozen() {
        var frozenCount = 0;
        for (var person : people) {
            if (!person.on) {
                frozenCount++;
            }
        }
        return frozenCount;
    }

    public int totalInSimulation() {
        return people.size();
    }
}
