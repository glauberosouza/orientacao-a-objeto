package br.com.glauber.exerc22;

public class MuitospraMuitos {
    public static void main(String[] args) {
        Sensor sensorA = new Sensor(53554, true);
        Sensor sensorB = new Sensor(53554, true);
        Sensor sensorC = new Sensor(53554, true);

        Trigger triggerA = new Trigger("Escudo:", "Ativar escudo");
        Trigger triggerB = new Trigger("Reserva de Energia:", "Ativar Reserva de Energia");
        Trigger triggerC = new Trigger("Alarme Sonoro:", "Ativar Alerta Sonoro");

        sensorA.addTrigger(triggerA);
        sensorA.addTrigger(triggerB);

        sensorB.addTrigger(triggerA);
        sensorB.addTrigger(triggerB);


        sensorC.addTrigger(triggerA);
        sensorC.addTrigger(triggerB);
        sensorC.addTrigger(triggerC);
        System.out.println();

        System.out.println("Primeira veirificação");
        triggerA.shouldTrigger();
        triggerB.shouldTrigger();
        triggerC.shouldTrigger();

        sensorA.detected = true;
        System.out.println();
        System.out.println("Segunda veirificação");
        triggerA.shouldTrigger();
        triggerB.shouldTrigger();
        triggerC.shouldTrigger();

        sensorC.detected = true;
        System.out.println();
        System.out.println("Terceira veirificação");
        triggerA.shouldTrigger();
        triggerB.shouldTrigger();
        triggerC.shouldTrigger();
        System.out.println();
    }
}