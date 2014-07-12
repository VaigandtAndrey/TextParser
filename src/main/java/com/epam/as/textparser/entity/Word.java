package com.epam.as.textparser.entity;

import java.util.List;

public class Word extends AbstractCompoundText<Symbol> implements SentencePart {

    public Word(List<Symbol> components) {
        super(components);
    }

    public Word() {
        super();
    }

}
