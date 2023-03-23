package br.com.glauber.exerc31;

public class AdminAccount extends Account{
    private String login;
    private String password;

    public AdminAccount(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean isAdmin() {

        return true;
    }

    @Override
    public String getCredentials() {
        return "Login: "+login + " " + "Password: " + password;
    }
}