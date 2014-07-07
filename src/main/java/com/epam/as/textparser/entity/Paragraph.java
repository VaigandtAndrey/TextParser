package com.epam.as.textparser.entity;

import java.util.List;

public class Paragraph extends AbstractCompoundText<Sentence> implements TextPart {
    List<Sentence> sentences;
}
