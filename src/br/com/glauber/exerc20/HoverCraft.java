package br.com.glauber.exerc20;

public class HoverCraft {
    String name;
    int currentSpeed = 0;
    Motor motor;

    public HoverCraft(String name) {
        this.name = name;
        this.motor = new Motor(65457683);
    }

    public void ligarNave() {
        motor.on = true;
    }

    public void desligarNave() {
        motor.on = false;
    }

    public boolean naveEstaLigada() {
        if (motor.on != false) {
            System.out.println("A nave está ligada!");
        } else {
            System.out.println("A nave está desligada!");
        }
        return motor.on;
    }

    public void acelerarANave() {
        currentSpeed += 10;
    }

    public void desacelerarANave() {
        if (currentSpeed == 0) {
            return;
        }
        currentSpeed -= 10;
    }

    public boolean naveEstaParada() {
        return currentSpeed == 0;
    }

    @Override
    public String toString() {
        return "HoverCraft{" +
                "name='" + name + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", motor=" + motor +
                '}';
    }
}
