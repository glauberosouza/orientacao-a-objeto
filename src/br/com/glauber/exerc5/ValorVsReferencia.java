package br.com.glauber.exerc5;

import java.time.LocalDateTime;
import java.util.Locale;

public class ValorVsReferencia {
    public static void main(String[] args) {
        int valorA = 100;
        int valorB = 200;
        valorA = valorB;
        valorA += 50;
        valorB += 100;
        System.out.println(valorA);
        System.out.println(valorB);


       var data = LocalDateTime.now();
        System.out.println(data);
        var data2 = data;
        System.out.println(data);
    }
}
