package br.com.glauber.exerc20;

public class Motor {

     int serialNumber;
     String power = "2_0000CV";
     boolean on;

    public Motor(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    @Override
    public String toString() {
        return "Motor{" +
                "serialNumber=" + serialNumber +
                ", power='" + power + '\'' +
                ", on=" + on +
                '}';
    }
}
