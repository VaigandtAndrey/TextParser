package com.epam.as.textparser.entity;

import java.util.List;

public class Word extends AbstractCompoundText<Letter> implements SentencePart{


    private Letter element;

    public Word(List<Letter> components) {
        super(components);
    }

    @Override
    public Letter getElement(int index) {
        return super.getElement(index);
    }

    @Override
    public boolean add(Letter element) {
        this.element = element;
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toSourceString() {
        return null;
    }
}
