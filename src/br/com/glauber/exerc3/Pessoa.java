package br.com.glauber.exerc3;

public class Pessoa {

    String corDosOlhos;
    String nome;
    int idade;
    boolean estaVivo;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public void falar() {
        System.out.println("ESTOU FALANDO!");
    }

    public void andar() {
        System.out.println("ESTOU ANDANDO!");
    }

    public void pular() {
        System.out.println("ESTOU PULANDO!");
    }

    public void dormir() {
        System.out.println("ESTOU DORMINDO!");
    }

}
