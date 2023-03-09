package br.com.glauber.exerc28;

public class Ship {
    private String name;

    public Ship(String name) {
        this.name = name;
    }

    String packageChannel4056 (){

        return name.concat(" Channel 4056: I hear you");

    }
    protected String protectedChannel1021 (){
        return name.concat(" Channel 1021: I hear you");
    }
    public String publicChannel1010 (){

        return name.concat(" Channel 1010: I hear you");

    }
    protected String broadCast(){
       return "Not implemented";
    }
}