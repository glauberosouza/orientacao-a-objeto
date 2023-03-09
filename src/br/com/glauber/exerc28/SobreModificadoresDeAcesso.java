package br.com.glauber.exerc28;

public class SobreModificadoresDeAcesso {
    public static void main(String[] args) {

        Ship hovercraft = new Hovercraft("Besouro");

        System.out.println( hovercraft.publicChannel1010());
        System.out.println(hovercraft.packageChannel4056());
        System.out.println(hovercraft.protectedChannel1021());

        System.out.println(hovercraft.broadCast());
    }
}