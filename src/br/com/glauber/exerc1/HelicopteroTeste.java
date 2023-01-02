package br.com.glauber.exerc1;


public class HelicopteroTeste {

    public static void main(String[] args) {

        Helicoptero helicoptero1 = new Helicoptero();
        Helicoptero helicoptero2 = new Helicoptero();

        helicoptero1.modelo = "B212";
        helicoptero1.nome = "Bell 212";

        helicoptero2.modelo = "Apache";
        helicoptero2.nome = "Gafanhoto";

        System.out.println("MODELO => " + helicoptero1.modelo);
        System.out.println("NOME => " + helicoptero1.nome);
        System.out.println("ESTÁ LIGADO => " + helicoptero1.ligado);
        System.out.println();

        helicoptero2.ligado = true;
        System.out.println("MODELO => " + helicoptero2.modelo);
        System.out.println("NOME => " + helicoptero2.nome);
        System.out.println("ESTÁ LIGADO => " + helicoptero2.ligado);
    }
}