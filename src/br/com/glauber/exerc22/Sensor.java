package br.com.glauber.exerc22;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    int serialNumber;
    boolean on;
    boolean detected;
    List<Trigger> triggers = new ArrayList<>();

    public Sensor(int serialNumber, boolean on) {
        this.serialNumber = serialNumber;
        this.on = on;
    }
    public void addTrigger(Trigger trigger){
        triggers.add(trigger);
        trigger.sensors.add(this);
    }
    public boolean wasSomethingDetected(){
        return detected;
    }
}
