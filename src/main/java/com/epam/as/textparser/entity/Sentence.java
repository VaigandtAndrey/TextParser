package com.epam.as.textparser.entity;

import java.util.List;

public class Sentence extends AbstractCompoundText<Word> {
    public Sentence(List<Word> components) {
        super(components);
    }

    @Override
    public TextPart getElement(int index) {
        return super.getElement(index);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
