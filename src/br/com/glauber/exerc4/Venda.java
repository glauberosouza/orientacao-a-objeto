package br.com.glauber.exerc4;

public class Venda {
    int valor;
    static int total = 0;

    public Venda(int valor) {
        this.valor = valor;
        total += this.valor;
    }
    public static void relatorio() {
        System.out.println("TODAS AS VENDAS ATÉ AGORA SOMAM: " + total);
    }
}
