package com.example.sphwintegerlist2.exceptions;

public class IndexIsNotValidException extends RuntimeException{

    public IndexIsNotValidException() {
        super("Index out of bounds!");
    }
}
