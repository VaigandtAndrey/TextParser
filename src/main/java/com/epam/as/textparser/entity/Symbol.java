package com.epam.as.textparser.entity;

public class Symbol implements TextPart {
    private char symbol;

    @Override
    public String toString() {
        return "" + symbol;
    }
}
