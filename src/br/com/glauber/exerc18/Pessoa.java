package br.com.glauber.exerc18;

import java.util.Objects;

public class Pessoa {
    String nome;
    String novoNome;

    public Pessoa(String nome, String novoNome){
        this.nome = nome;
        this.novoNome = novoNome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equalsIgnoreCase(pessoa.nome)
                && novoNome.equalsIgnoreCase(pessoa.novoNome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, novoNome);
    }
}
