package com.example.sphwintegerlist2.exceptions;

public class ItemNotExistException extends RuntimeException{

    public ItemNotExistException() {
        super("This item dos not exist!");
    }
}
