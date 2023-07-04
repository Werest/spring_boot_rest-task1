package ru.werest.spring_boot_resttask1.exception;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
    }
}