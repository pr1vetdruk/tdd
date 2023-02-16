package ru.somsin.tdd.chapter3;

public class AuthenticatorDummy implements Authenticator {
    @Override
    public Boolean authenticate(String username, String password) {
        return null;
    }
}
