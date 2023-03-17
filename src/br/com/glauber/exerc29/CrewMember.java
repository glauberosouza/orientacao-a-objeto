package br.com.glauber.exerc29;
public class CrewMember {

    private String name;
    private int age;

    public CrewMember(String name, int age) {
        this.name = name.toUpperCase();
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}