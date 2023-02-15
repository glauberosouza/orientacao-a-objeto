package br.com.glauber.exerc21;

import java.util.ArrayList;
import java.util.List;

public class Hovercraft {
    String name;
    List<Sensor> sensores = new ArrayList<>();

    public Hovercraft(String name) {
        this.name = name;
        sensores.add(new Sensor(132453553, true));
        sensores.add(new Sensor(132453563, true));
        sensores.add(new Sensor(132453573, true));

    }

    public void ligarTodosOsSensores() {
        for (var sensor : sensores) {
            sensor.ligarSensor();
        }
    }

    public void desligarTodosOsSensores() {
        for (var sensor : sensores) {
            sensor.desligarSensor();
        }
    }

    public void ligarUmSensor(int indice) {
        if (indice >= 0) {
            sensores.get(indice).ligarSensor();
        }
    }

    public void desligarUmSensor(int indice) {
        if (indice >= 0) {
            sensores.get(indice).desligarSensor();
        }
    }

    @Override
    public String toString() {
        return "Hovercraft{" +
                "name='" + name + '\'' +
                ", sensores=" + sensores +
                '}';
    }
}
