package br.com.glauber.exerc14;

import java.util.Objects;

public class Nave {

    String nome;

    public Nave(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return nome.equals(nave.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
