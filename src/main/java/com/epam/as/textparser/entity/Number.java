package com.epam.as.textparser.entity;

public class Number {
    private char symbol;

    public Number(String line) {
        symbol = line.toCharArray()[0];
    }

    @Override
    public String toString() {
        return "" + symbol;
    }
}
