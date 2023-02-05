package br.com.glauber.exerc15;

import java.util.LinkedList;

public class SobreFilas {
    public static void main(String[] args) {

        LinkedList<String> nomes = new LinkedList<>();
        nomes.add("Glauber");
        nomes.add("Andreza");
        nomes.add("Gabriel");
        nomes.add("Anderson");
        nomes.offer("Aline");

        nomes.pop();

        System.out.println("A lista está vazia? " + nomes.isEmpty());
        System.out.println("Qual o tamanho da fila? " + nomes.size());
        System.out.println("O primeiro elemento é: " + nomes.peek());
        System.out.println("O primeiro elemento é: " + nomes.element());
        System.out.println();

        System.out.println("Os elementos da fila São: ");
        while (!nomes.isEmpty()) {
            System.out.println(nomes.poll());
        }
        System.out.println("A lista está vazia? " + nomes.isEmpty());
    }
}