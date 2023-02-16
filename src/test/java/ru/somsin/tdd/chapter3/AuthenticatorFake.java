package ru.somsin.tdd.chapter3;

public class AuthenticatorFake implements Authenticator {
    @Override
    public Boolean authenticate(String username, String password) {
        return "test".equals(username) && "123456".equals(password);
    }
}
