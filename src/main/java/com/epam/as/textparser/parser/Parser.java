package com.epam.as.textparser.parser;

import com.epam.as.textparser.entity.*;

public interface Parser {
    public Text parseText(String str);
    public Paragraph parseParagraph(String str);
    public Sentence parseSentence(String str);
    public Word parseWord(String str);
    public Character parseCharacter(String str);
}
