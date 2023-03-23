package br.com.glauber.exerc31;

public abstract class Account {
    public boolean isAdmin(){
        return false;
    }
    public abstract String getCredentials();
}