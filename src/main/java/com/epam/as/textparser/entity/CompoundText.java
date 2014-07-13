package com.epam.as.textparser.entity;

import java.util.List;

public interface CompoundText<T extends TextPart> {
    T getElement(int index);

    List<T> getAllElements();

    boolean add(T element);

    String toSourceString();
}
