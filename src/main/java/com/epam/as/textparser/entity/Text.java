package com.epam.as.textparser.entity;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Paragraph> paragraphs;

    public Text(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public Text(String string) {
    }

    public Text() {
        this.paragraphs = new ArrayList<Paragraph>();
    }

    public void addParagraph(Paragraph addPar) {
        this.paragraphs.add(addPar);
    }

    public void addParagraphs(List<Paragraph> addPars) {
        for (Paragraph addPar : addPars) {
            this.paragraphs.add(addPar);
        }
    }

    @Override
    public String toString() {
        return "Text{" +
                "paragraphs=" + paragraphs +
                '}';
    }
}
