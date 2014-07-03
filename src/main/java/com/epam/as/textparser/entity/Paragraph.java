package com.epam.as.textparser.entity;

import com.epam.as.textparser.util.Parser;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    String stringParagraph;
    List<Sentence> sentences;

    public Paragraph(String stringParagraph) {
        sentences = new ArrayList<>();
        this.stringParagraph = stringParagraph;
        sentences.addAll(Parser.parseSentences(stringParagraph));
    }

    @Override
    public String toString() {
        return sentences.toString();
    }

    public void addSentence(Sentence sentence) {
        sentences.add(sentence);
    }
}
