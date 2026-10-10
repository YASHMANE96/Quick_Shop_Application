package com.BackEnd.Quick_Shop.Exceptions;


public class NotAuthorizedException extends RuntimeException{

    public NotAuthorizedException(String Message) {
        super(Message);
    }
}
