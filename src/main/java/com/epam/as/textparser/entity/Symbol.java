package com.epam.as.textparser.entity;

public class Symbol {
    private char symbol;

    public Symbol(String line) {
        symbol = line.toCharArray()[0];
    }

    @Override
    public String toString() {
        return "" + symbol;
    }
}
