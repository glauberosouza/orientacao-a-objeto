package br.com.glauber.exerc18;

import java.util.HashSet;

public class SobreHashcode {
    public static void main(String[] args) {
        var conjuntoPessoa = new HashSet<Pessoa>();

        conjuntoPessoa.add(new Pessoa("Renan", "Glauber"));
        conjuntoPessoa.add(new Pessoa("Andreza", "Priscila"));
        conjuntoPessoa.add(new Pessoa("Anderson", "Alex"));

        System.out.println("HÁ PESSOAS NESSE CONJUNTO? " + conjuntoPessoa.contains(
                new Pessoa("Renan", "Glauber")));
    }
}