package com.epam.as.textparser.entity;

public class Symbol implements WordPart {

    private final char value;

    public Symbol(char value) {
        this.value = value;
    }

    @Override
    public String toSourceString() {
        return null;
    }
}
