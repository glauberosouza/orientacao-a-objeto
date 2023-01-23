package br.com.glauber.exerc12;

public class Pessoa {
    String nome;
    String novoNome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equalsIgnoreCase(pessoa.nome)
                && novoNome.equalsIgnoreCase(pessoa.novoNome);
    }
}