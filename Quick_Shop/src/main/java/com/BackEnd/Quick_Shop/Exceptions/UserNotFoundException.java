package com.BackEnd.Quick_Shop.Exceptions;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String Message) {
        super(Message);
    }

}
