package br.com.glauber.exerc13;

import java.util.HashSet;
import java.util.Set;

public class SobreConjuntos {

    public static void main(String[] args) {

        //CONJUNTO HETEROGÊNEO
        HashSet conjunto = new HashSet<>();
        conjunto.add(10);
        conjunto.add(false);
        conjunto.add('A');
        System.out.println("O TAMANHO DO CONJUNTO É: " + conjunto.size());
        conjunto.remove('A');
        System.out.println("O TAMANHO DO CONJUNTO É: " + conjunto.size());
        System.out.println("O VALOR 10 ESTÁ CONTIDO NO CONJUNTO? " + conjunto.contains(10));

        HashSet conjunto2 = new HashSet<>();
        conjunto.add(10);
        conjunto.add(11);
        conjunto.add(12);
        conjunto.add(13);

        conjunto.addAll(conjunto2);
        System.out.println("RESULTADO DA UNIÃO DE 2 CONJUNTOS: " + conjunto);

        HashSet conjunto3 = new HashSet<>();
        conjunto3.add(10);
        conjunto3.add(40);
        // INTERSECÇÃO -> O QUE ELES TÊM EM COMUM
        conjunto.retainAll(conjunto3);
        System.out.println("RESULTADO DA INTERSECÇÃO DO PRIMEIRO CONJUNTO COM O ULTIMO: " + conjunto);
        conjunto.clear();
        System.out.println("RESULTADO DEPOIS DE LIMPAR O PRIMEIRO CONJUNTO: " + conjunto);
    }
}