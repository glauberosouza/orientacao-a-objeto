package br.com.glauber.exerc27;

public class Alert {

    public void shouldAlert(MachinesSimple machinesSimple) {
        if (machinesSimple == MachinesSimple.SENTINELS) {
            System.out.println("DANGER! SENTINELS DETECTED!!!!");
        }
    }

    public void shouldAlert(Machines machines) {
        if (machines.isAgressive()) {
            System.out.println("DANGER! AGGRESSIVE MACHINE DETECTED: " + machines.name());
        } else {
            System.out.println("ALERT! A NON AGGRESSIVE MACHINE DETECTED: " + machines.name());
        }
    }
}