package br.com.glauber.exerc28;

public class Hovercraft extends Ship{
    private String name;

    public Hovercraft(String name) {
        super(name);
        this.name = name;
    }

    private String privateChannel06(){
        return name.concat(" Channel l06: I hear you");
    }

    @Override
    public String broadCast() {
        return this.privateChannel06();
    }
}