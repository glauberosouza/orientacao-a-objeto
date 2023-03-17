package br.com.glauber.exerc30;

public class Student implements Karate, KungFu, MartialArts{

    @Override
    public void seikenTiudanZuki() {
        System.out.println("SeikenTiudanZuki lhe saúda");
    }

    @Override
    public void dragonTechnique() {
        System.out.println("dragonTechnique lhe saúda");
    }

    @Override
    public void greetings() {
        MartialArts.super.greetings();
    }
}