package com.epam.as.textparser.entity;

public interface CompoundText<T extends TextPart> {
    T getElement(int index);
    boolean add(T element);
    String toSourceString();
}
