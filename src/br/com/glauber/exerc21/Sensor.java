package br.com.glauber.exerc21;

public class Sensor {
    int serialNumber;
    boolean on;

    public Sensor(int serialNumber, boolean on) {
        this.serialNumber = serialNumber;
        this.on = on;
    }
    public void ligarSensor(){
        this.on = true;
    }
    public void desligarSensor(){
        this.on = false;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "serialNumber=" + serialNumber +
                ", on=" + on +
                '}';
    }
}