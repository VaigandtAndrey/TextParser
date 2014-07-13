package com.epam.as.textparser.entity;

import java.util.List;

public class Sentence extends AbstractCompoundText<SentencePart> implements TextPart, ParagraphPart, Comparable<Sentence> {

    public Sentence(List<SentencePart> components) {
        super(components);
    }

    public Sentence() {
        super();
    }

    @Override
    public int compareTo(Sentence o) {
        return 0;
    }
}
