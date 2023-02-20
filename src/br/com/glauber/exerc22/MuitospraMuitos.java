package br.com.glauber.exerc22;

public class MuitospraMuitos {
    public static void main(String[] args) {
        Sensor sensorA = new Sensor(53554, true);
        Sensor sensorB = new Sensor(53554, true);
        Sensor sensorC = new Sensor(53554, true);

        Trigger triggerA = new Trigger("Esquerda", "Ativar escudo");
        Trigger triggerB = new Trigger("Direita", "Ativar Reserva de Energia");
        Trigger triggerC = new Trigger("Cima", "Ativar Alerta Sonoro");

        sensorA.addTrigger(triggerA);
        sensorA.addTrigger(triggerB);

        sensorB.addTrigger(triggerA);
        sensorB.addTrigger(triggerB);


        sensorC.addTrigger(triggerA);
        sensorC.addTrigger(triggerB);
        sensorC.addTrigger(triggerC);

        System.out.println("Primeira veirificação");
        triggerA.shouldTrigger();
        triggerB.shouldTrigger();
        triggerC.shouldTrigger();

        sensorA.detected = true;
        System.out.println("Segunda veirificação");
        triggerA.shouldTrigger();
        triggerB.shouldTrigger();
        triggerC.shouldTrigger();

        sensorC.detected = true;
        System.out.println("Terceira veirificação");
        triggerA.shouldTrigger();
        triggerB.shouldTrigger();
        triggerC.shouldTrigger();
    }
}