package br.com.glauber.exerc6;

public class UsoDoThis {
    String nome;
    String idade;

    public UsoDoThis() {
        this("Glauber", "30");
    }

    public UsoDoThis(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        UsoDoThis usoDoThis = new UsoDoThis();
        System.out.println(usoDoThis.nome + usoDoThis.idade);
    }
}
