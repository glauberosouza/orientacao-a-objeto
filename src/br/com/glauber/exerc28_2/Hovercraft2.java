package br.com.glauber.exerc28_2;

import br.com.glauber.exerc28.Ship;

public class Hovercraft2 extends Ship {
    private String name;

    public Hovercraft2(String name) {
        super(name);
        this.name = name;
    }

    @Override
    protected String protectedChannel1021() {
        return super.protectedChannel1021();
    }

    private String privateChannel06() {
        return name.concat(" Channel l06: I hear you");
    }

    @Override
    protected String broadCast() {
        return super.broadCast();
    }
}