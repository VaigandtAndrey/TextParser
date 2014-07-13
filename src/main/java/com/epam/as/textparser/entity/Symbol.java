package com.epam.as.textparser.entity;

public class Symbol implements WordPart {

    private Character value;

    public Symbol(Character value) {
        this.value = value;
    }

    public Symbol() {
        this.value = '\0';
    }

    public Symbol(String str) {
        for (char o : str.toCharArray() ) {
            this.value = Character.valueOf(o);
        }
    }

    @Override
    public String toSourceString() {
        return toString();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
