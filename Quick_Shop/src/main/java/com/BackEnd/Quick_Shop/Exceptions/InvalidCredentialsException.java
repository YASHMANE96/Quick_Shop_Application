package com.BackEnd.Quick_Shop.Exceptions;

public class InvalidCredentialsException extends RuntimeException {

    public InvalidCredentialsException(String Message) {
        super(Message);
    }
}
