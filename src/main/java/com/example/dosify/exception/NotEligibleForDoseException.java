package com.example.dosify.exception;

public class NotEligibleForDoseException extends Exception{
    public NotEligibleForDoseException(String message){
        super((message));
    }
}
