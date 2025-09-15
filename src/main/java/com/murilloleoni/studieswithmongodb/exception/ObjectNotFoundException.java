package com.murilloleoni.studieswithmongodb.exception;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
