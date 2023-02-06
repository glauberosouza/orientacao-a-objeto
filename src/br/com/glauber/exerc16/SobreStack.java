package br.com.glauber.exerc16;

import java.util.Stack;

public class SobreStack {
    public static void main(String[] args) {

        Stack<String> livros = new Stack<>();

        livros.push("Matemática");
        livros.push("História");
        livros.push("Inglês");
        livros.push("Lingua Portuguesa");
        livros.pop();

        System.out.println("A lista está vazia? " + livros.isEmpty());
        System.out.println("Quantos livros têm na pilha? " + livros.size());
        System.out.println("O primeiro elemento é: " + livros.peek());
        System.out.println();

        System.out.println("Os elementos da pilha São: ");
        while (!livros.isEmpty()) {
            System.out.println(livros.pop());
        }
        System.out.println("A lista está vazia? " + livros.isEmpty());
    }
}


