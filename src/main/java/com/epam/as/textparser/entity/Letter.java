package com.epam.as.textparser.entity;

public class Letter {
    private char symbol;

    public Letter(String line) {
        symbol = line.equals("") ? ' ' : line.toCharArray()[0];
    }

    @Override
    public String toString() {
        return "" + symbol;
    }
}