package br.com.glauber.exerc21;

public class SobreComposicaoUmPraMuitos {
    public static void main(String[] args) {

        Hovercraft hovercraft = new Hovercraft("Fuscao");

        System.out.println(hovercraft);
        hovercraft.desligarTodosOsSensores();
        System.out.println(hovercraft);
        hovercraft.ligarUmSensor(1);
        System.out.println(hovercraft);
    }
}