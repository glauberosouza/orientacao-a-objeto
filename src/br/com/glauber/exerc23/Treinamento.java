package br.com.glauber.exerc23;

public class Treinamento {
    private String nome;

    public void adicionaTreinamento(String nome) {
        if (nome.isBlank()) {
            System.out.println("O nome não pode ser em branco");
            return;
        }
        System.out.println("Começando a converter o nome... ");
        this.nome = nome.trim().toUpperCase();
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Treinamento{" +
                "nome='" + nome + '\'' +
                '}';
    }
}