package br.com.glauber.exerc14;

import java.util.ArrayList;

public class SobreListas {
    public static void main(String[] args) {

        var naves = new ArrayList<Nave>();
        naves.add(new Nave("Avatar"));
        var icarus = new Nave("Icarus");
        naves.add(icarus);
        naves.add(new Nave("Logos"));
        naves.add(new Nave("Nebuchadnezzar"));

        System.out.println("QUAL O NOME DA NAVE QUE ESTÁ NO INDICE 2: " + naves.get(2).nome);
        for (var nave : naves) {
            System.out.println("NOME DA NAVE É: " + nave.nome);
        }
        naves.remove(0);
        naves.remove(icarus);

        naves.removeIf(nave -> nave.nome.equalsIgnoreCase("Logos"));
        for (var nave : naves) {
            System.out.println("NOME DA NAVE É: " + nave.nome);
        }
        var nebuchadnezzar = new Nave("Nebuchadnezzar");

        System.out.println("TÊM NA LISTA A NAVE NEBUCHADNEZZAR? " + naves.contains(nebuchadnezzar));
        naves.clear();
        System.out.println(naves);
    }
}
