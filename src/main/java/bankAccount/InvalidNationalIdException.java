package com.company.curs3java;

public class InvalidNationalIdException extends RuntimeException{
    public InvalidNationalIdException(String message, Throwable cause) {
        super(message, cause);
    }

    static boolean checkId(String id) {
        return id.length() == 6;
    }
}
