package com.epam.as.textparser.entity;

import com.epam.as.textparser.util.Parser;

import java.util.ArrayList;
import java.util.List;

public class Text {
    String stringText;
    List<Paragraph> paragraphs;

    public Text(String stringText) {
        paragraphs = new ArrayList<>();
        this.stringText = stringText;
        paragraphs.addAll(Parser.parseParagraphs(stringText));
    }

    @Override
    public String toString() {
        return paragraphs.toString();
    }

    public void addParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }
}
