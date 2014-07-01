package com.epam.as.textparser.entity;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    private List<Sentence> sentences;
    private String submittedParagraph;

    public Paragraph(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public Paragraph(String string) {
        this.submittedParagraph = string;
    }

    public Paragraph() {
        List<Sentence> paragraphs = new ArrayList<>();
    }

    public void addSentence(Sentence addsent) {
        this.sentences.add(addsent);
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "sentences=" + sentences +
                '}';
    }
}





