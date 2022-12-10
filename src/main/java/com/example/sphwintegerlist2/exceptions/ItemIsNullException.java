package com.example.sphwintegerlist2.exceptions;

public class ItemIsNullException extends RuntimeException{

    public ItemIsNullException() {
        super("Item might be not null!");
    }
}