package com.epam.as.textparser.entity;

public class Letter extends Symbol {

    //todo   "-" is a letter too, when use dual words, semi-particular etc
    public Letter(char value) {
        super(value);
    }

    @Override
    public String toSourceString() {
        return null;
    }
}