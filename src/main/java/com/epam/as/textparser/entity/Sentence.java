package com.epam.as.textparser.entity;

import java.util.List;

public class Sentence extends AbstractCompoundText<Word> implements TextPart, ParagraphPart {

    public Sentence(List<Word> components) {
        super(components);
    }

    public Sentence() {
        super();
    }

}
