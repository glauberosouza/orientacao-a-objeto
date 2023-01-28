package br.com.glauber.exerc13;

import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntosHomogeneos {
    public static void main(String[] args) {
        // CONJUNTO HOMOGENEO
        var conjunto = new HashSet<String>();
        conjunto.add("Domingo");
        conjunto.add("Segunda");
        conjunto.add("Terça");
        conjunto.add("Quarta");

        for (String texto : conjunto) {
            System.out.println("RESULTADO DOS VALORES ATRIBUIDOS AO CONJUNTO: " + texto);
        }

        // CONJUNTO HOMOGENEO ORDENADO
        var conjuntoInteiros = new TreeSet<Integer>();
        conjuntoInteiros.add(30);
        conjuntoInteiros.add(31);
        conjuntoInteiros.add(32);
        conjuntoInteiros.add(33);
        System.out.println("ORDEM DOS VALORES DO CONJUNTO: " + conjuntoInteiros);
    }
}