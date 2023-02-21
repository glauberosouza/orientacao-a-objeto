package br.com.glauber.exerc22;

import java.util.ArrayList;
import java.util.List;

public class Trigger {
    String name;
    String action;
    boolean actionDone;
    List<Sensor> sensors = new ArrayList<>();

    public Trigger(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
        sensor.triggers.add(this);
    }

    public void shouldTrigger() {
        for (Sensor sensor : sensors) {
            if (sensor.wasSomethingDetected() && actionDone) {
                continue;
            } else if(sensor.wasSomethingDetected()){
                System.out.println("ALERTA! -> TRIGGER: " + this.name + "ON INICIANDO AÇÃO -> " + this.action);
                this.actionDone = true;
            }else{
                System.out.println("TUDO CERTO NO SENSOR: " + sensor.serialNumber);
            }
        }
    }
}
