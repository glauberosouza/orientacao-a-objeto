package br.com.glauber.exerc2;


public class HelicopteroTeste {

    public static void main(String[] args) {

        Helicoptero helicoptero3 = new Helicoptero();

        helicoptero3.modelo = "Apache";
        helicoptero3.nome = "Gafanhoto";

        helicoptero3.ligar();
        var pessoa = "Glauber";
        helicoptero3.transferirComoPilotar(pessoa);

        var pessoa1 = "Trinity";
        var pessoa2 = "Mufazza";
        helicoptero3.transferirComoPilotar(pessoa1, pessoa2);
        helicoptero3.desligar();
    }
}