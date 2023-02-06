package br.com.glauber.exerc17;

import java.util.HashMap;

public class SobreMap {
    public static void main(String[] args) {

        var tripulantes = new HashMap<Integer, String>();
        tripulantes.put(1, "Neo");
        tripulantes.put(2, "Morpheus");
        tripulantes.put(3, "Trinity");
        tripulantes.put(4, "cypher");



        System.out.println("O TAMANHO DO MAP É: " + tripulantes.size());
        System.out.println("A MAP ESTÁ VAZIO? " + tripulantes.isEmpty());
        System.out.println("AS CHAVES DO MAP SÃ0: " + tripulantes.keySet());
        System.out.println("OS VALORES DO MAP SÃO: " + tripulantes.values());
        System.out.println("AS CHAVES E OS VALORES DO MAP SÃO: " + tripulantes.entrySet());
        System.out.println("O MAP TEM A CHAVE COM VALOR 10? " + tripulantes.containsKey(10));
        System.out.println("O MAP TEM O VALOR NEO? " + tripulantes.containsValue("Neo"));
        System.out.println("O TRIPULANTE DE CHAVE 2 É: " + tripulantes.get(2));

        System.out.println();
        tripulantes.put(2, "Tank");
        for (var chave : tripulantes.keySet()) {
            System.out.println("A CHAVE DO MAP É:" + chave);
        }
        System.out.println();
        for (var valor : tripulantes.values()) {
            System.out.println("O VALOR DO MAP É: " + valor);
        }
        System.out.println();
        for (var chaveEValor : tripulantes.entrySet()) {
            System.out.println("AS CHAVE É: " + chaveEValor.getKey() + " E O VALOR É: " + chaveEValor.getValue());
        }
    }
}