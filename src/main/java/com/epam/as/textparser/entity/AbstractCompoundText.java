package com.epam.as.textparser.entity;

import java.util.List;

public abstract class AbstractCompoundText<T> implements CompoundText {
    private List<T> components;

    public AbstractCompoundText(List<T> components) {
        this.components = components;
    }
    public AbstractCompoundText() {
    }


    @Override
    public TextPart getElement(int index) {
        return null;
    }

    @Override
    public String toString() {
        return components.toString();
    }
}

