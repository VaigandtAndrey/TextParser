package com.epam.as.textparser.entity;

public class Number<T extends java.lang.Number> implements SentencePart {

    private T value;

    public Number(T val) {
        this.value = val;
    }

    @Override
    public String toSourceString() {
        return String.valueOf(value);
    }
}
