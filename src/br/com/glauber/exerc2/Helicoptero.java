package br.com.glauber.exerc2;

public class Helicoptero {
    String modelo;
    String nome;
    boolean ligado;
    boolean motorLigado;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void ligarMotor() {
        motorLigado = true;
    }

    public void desligarMotor() {
        motorLigado = false;
    }

    public boolean transferirComoPilotar(String nome) {
        if (nome.isBlank()) {
            System.out.println("O NOME NÃO PODE SER EM BRANCO");
            return false;
        }
        System.out.println("TRANSFERINDO CONHECIMENTO PARA => " + nome);
        return true;
    }
                                            // Parâmetros ===> (String nome1)
    public boolean transferirComoPilotar(String nome1, String nome2) {
        if (nome1.isBlank() && nome2.isBlank()) {
            System.out.println("OS NOMES NÃO PODE SER EM BRANCO");
            return false;
        }
        System.out.println("TRANSFERINDO CONHECIMENTO PARA => " + nome1 + " E " + nome2);
        return true;
    }

    public void status() {
        System.out.println("MODELO => " + modelo);
        System.out.println("NOME => " + nome);
        System.out.println("ESTÁ LIGADO => " + ligado);
    }
}