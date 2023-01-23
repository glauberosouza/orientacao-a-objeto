package br.com.glauber.exerc12;

public class SobreEquals {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Glauber";
        pessoa1.novoNome = "Renato";

        pessoa2.nome = "Glauber";
        pessoa2.novoNome = "Renato";

        System.out.println("Pessoa 1 é igual a pessoa 2? " + (pessoa1 == pessoa2));
        System.out.println("Pessoa 1 é igual a pessoa 2? " + pessoa1.equals(pessoa2));
    }
}
