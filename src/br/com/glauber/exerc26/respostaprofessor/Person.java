package br.com.glauber.exerc26.respostaprofessor;

public class Person extends Humanoid {
    char sex;
    String hairColor;

    public Person(char sex, String hairColor, String accessLevel) {
        super(accessLevel);
        this.sex = sex;
        this.hairColor = hairColor;
    }

    public static Person generateRandomPerson() {
        return new Person(generateRandomSex(), generateRandomHairColor(), "ACTOR");
    }
}
