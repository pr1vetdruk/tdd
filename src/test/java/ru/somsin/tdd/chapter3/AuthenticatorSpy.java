package ru.somsin.tdd.chapter3;

public class AuthenticatorSpy implements Authenticator {
    protected String username;
    protected String password;
    protected int counter;

    @Override
    public Boolean authenticate(String username, String password) {
        counter++;

        this.username = username;
        this.password = password;

        return true;
    }
}
