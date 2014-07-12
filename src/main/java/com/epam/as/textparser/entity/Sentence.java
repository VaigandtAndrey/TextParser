package com.epam.as.textparser.entity;

import java.util.List;

public class Sentence extends AbstractCompoundText<Word> implements TextPart, ParagraphPart {
    private Word element;

    public Sentence(List<Word> components) {
        super(components);
    }

    @Override
    public boolean add(Word element) {
        this.element = element;
        return false;
    }

    @Override
    public String toSourceString() {
        return null;
    }
}
