package com.epam.as.textparser.entity;

import com.epam.as.textparser.util.Parser;

import java.util.ArrayList;
import java.util.List;

public class Word {
    String stringWord;
    List<Letter> letters;

    public Word(String stringWor) {
        letters = new ArrayList<>();
        this.stringWord = stringWor;
        if (!Parser.parseLetters(stringWord).isEmpty()) {
            letters.addAll(Parser.parseLetters(stringWord));
        }
    }

    @Override
    public String toString() {
        return stringWord;
    }

    public void addSentence(Letter letter) {
        letters.add(letter);
    }
}
