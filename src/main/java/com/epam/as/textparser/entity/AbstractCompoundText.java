package com.epam.as.textparser.entity;

import java.util.List;

public class AbstractCompoundText<T> implements CompoundText{
    private List<T> components;

    @Override
    public TextPart getElement(int index) {
        return null;
    }
}

