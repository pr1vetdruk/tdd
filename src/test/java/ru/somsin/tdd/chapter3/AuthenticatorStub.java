package ru.somsin.tdd.chapter3;

public class AuthenticatorStub implements Authenticator {
    @Override
    public Boolean authenticate(String username, String password) {
        return false;
    }
}
