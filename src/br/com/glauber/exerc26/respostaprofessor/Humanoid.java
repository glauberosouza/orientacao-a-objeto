package br.com.glauber.exerc26.respostaprofessor;

import java.util.Random;

public class Humanoid {
    protected final String accessLevel;
    protected boolean on;
    private boolean haveAGun;
    private boolean isAgent;

    public Humanoid(String accessLevel) {
        this.on = true;
        this.isAgent = false;
        this.haveAGun = false;
        this.accessLevel = accessLevel;
    }

    protected static char generateRandomSex() {
        var sexOptions = new char[]{'F', 'M'};
        return sexOptions[new Random().nextInt(2)];
    }

    protected static String generateRandomHairColor() {
        var hairColors = new String[]{"Blond", "Dark", "Gray", "Red"};
        return hairColors[new Random().nextInt(2)];
    }

    public void freeze() {
        if (this.accessLevel.equals("ROOT") || this.accessLevel.equals("RECRUIT")) {
            return;
        }

        this.on = false;
    }

    public void turnIntoAgent() {
        this.isAgent = true;
        this.haveAGun = true;
    }

}
