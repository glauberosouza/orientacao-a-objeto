package br.com.glauber.exerc27;

public class SobreEnum {
    public static void main(String[] args) {
        Alert alert = new Alert();
        alert.shouldAlert(MachinesSimple.SENTINELS);
        alert.shouldAlert(Machines.ARMADAS);
    }
}