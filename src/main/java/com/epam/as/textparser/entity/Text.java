package com.epam.as.textparser.entity;

import java.util.List;

public class Text extends AbstractCompoundText<Paragraph>{

    public Text(List<Paragraph> components) {
        super(components);
    }
    public Text() {
        super();
    }

    @Override
    public Paragraph getElement(int index) {
        return super.getElement(index);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
