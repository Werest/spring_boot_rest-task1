package ru.werest.spring_boot_resttask1.exception;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}
