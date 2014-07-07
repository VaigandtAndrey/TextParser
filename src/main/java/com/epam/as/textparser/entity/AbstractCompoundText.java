package com.epam.as.textparser.entity;

import java.util.ArrayList;
import java.util.List;

public class AbstractCompoundText<T> implements CompoundText {
    private List<T> components;

    public AbstractCompoundText() {
        components = new ArrayList<T>();
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

