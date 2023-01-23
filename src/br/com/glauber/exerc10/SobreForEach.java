package br.com.glauber.exerc10;

public class SobreForEach {
    public static void main(String[] args) {
        int[] serialNumbers = new int[10];

        serialNumbers[0] = 123456;
        serialNumbers[1] = 234567;
        serialNumbers[2] = 345678;
        serialNumbers[3] = 456789;
        serialNumbers[4] = 5678910;
        serialNumbers[5] = 67891011;
        serialNumbers[6] = 789101112;
        serialNumbers[7] = 89101112;
        serialNumbers[8] = 12345432;
        serialNumbers[9] = 1234567654;

        // FOREACH CONHECIDO TAMBÉM COMO ENHANCED FOR
        for (int serialNumber : serialNumbers) {
            if (serialNumber > 234567) {
                System.out.println("PARANDO AQUI!");
                break;
            }
            System.out.println(serialNumber);
        }
    }

}

