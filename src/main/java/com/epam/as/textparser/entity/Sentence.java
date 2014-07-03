package com.epam.as.textparser.entity;

import com.epam.as.textparser.util.Parser;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    String stringSentence;
    List<Word> words;

    public Sentence(String stringSentence) {
        words = new ArrayList<>();
        this.stringSentence = stringSentence;
        words.addAll(Parser.parseWords(stringSentence));
    }

    @Override
    public String toString() {
        return stringSentence;
    }

    public void addSentence(Word word) {
        words.add(word);
    }
}
