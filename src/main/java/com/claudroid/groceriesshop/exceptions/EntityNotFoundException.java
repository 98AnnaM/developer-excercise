package com.claudroid.groceriesshop.exceptions;

public class EntityNotFoundException extends RuntimeException {

    public String message;

    public EntityNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
