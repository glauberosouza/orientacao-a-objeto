package br.com.glauber.exerc20;

public class SobreComposicaoUmPraUm {
    public static void main(String[] args) {

        HoverCraft hoverCraft = new HoverCraft("Nabucodonosor");
        hoverCraft.ligarNave();
        hoverCraft.acelerarANave();
        hoverCraft.acelerarANave();

        System.out.println(hoverCraft);

        hoverCraft.desacelerarANave();
        hoverCraft.desacelerarANave();
        hoverCraft.desacelerarANave();
        hoverCraft.desligarNave();

        System.out.println(hoverCraft);
    }
}
