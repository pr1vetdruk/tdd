package ru.somsin.tdd.chapter3;

public class AuthenticatorMock extends AuthenticatorSpy {
    private final String expectedUsername;
    private final String expectedPassword;

    public AuthenticatorMock(String expectedUsername, String expectedPassword) {
        this.expectedUsername = expectedUsername;
        this.expectedPassword = expectedPassword;
    }

    public boolean validate() {
        return expectedUsername.equals(username) && expectedPassword.equals(password);
    }
}
