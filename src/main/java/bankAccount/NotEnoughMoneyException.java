package com.company.curs3java;

public class NotEnoughMoneyException extends RuntimeException{
    public NotEnoughMoneyException(String message, Throwable cause) {
        super(message, cause);
    }
}
