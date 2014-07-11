package com.epam.as.textparser.entity;

import java.util.List;

public class Word extends AbstractCompoundText<Letter> implements SentencePart{

    public Word(List<Letter> components) {
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
