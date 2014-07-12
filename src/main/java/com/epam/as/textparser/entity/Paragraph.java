package com.epam.as.textparser.entity;

import java.util.List;

public class Paragraph extends AbstractCompoundText<Sentence> implements TextPart {

    public Paragraph(List<Sentence> components) {
        super(components);
    }

    public Paragraph() {
        super();
    }
}
