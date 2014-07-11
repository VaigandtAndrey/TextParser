package com.epam.as.textparser.entity;

import java.util.List;

public class Sentence extends AbstractCompoundText<Word> implements TextPart, ParagraphPart {
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

    @Override
    public void add(TextPart element) {

    }

    @Override
    public String toBuildString() {
        return null;
    }
}
