package br.com.glauber.exerc31;

public class NormalAccount extends Account{
    private String login;
    private String password;

    public NormalAccount(String login, String password) {
        this.login = login;
        this.password = password;
    }
    @Override
    public String getCredentials() {
        return "Login: "+login + " " + "Password: " + password;
    }
}