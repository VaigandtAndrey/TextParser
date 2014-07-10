package com.epam.as.textparser.parser;

import com.epam.as.textparser.entity.Paragraph;
import com.epam.as.textparser.entity.Sentence;
import com.epam.as.textparser.entity.Text;
import com.epam.as.textparser.entity.Word;
import com.epam.as.textparser.util.RegExPatternManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegExParser implements Parser{
    private final static Logger log = LoggerFactory.getLogger(Parser.class);

//    public  String[] test(String submittedText) {
//        RegExPatternManager pm = new RegExPatternManager("regex.properties");
//        String textStr = clean(submittedText);
//        String[] lines = textStr.split(pm.getPattern("sentence"));
//        return lines;
//    }

    public  String clean(String textStr) {
        RegExPatternManager pm = new RegExPatternManager("regex.properties");
        textStr = textStr.replaceAll(pm.getPattern("multiply.spaces"), " ");
        textStr = textStr.replaceAll("<", "&lt;").replaceAll(">","&gt;");
        return textStr;
    }

    public Text parseText(String sourceText) {
        Text text = new Text();

        return text;
    }

    @Override
    public Paragraph parseParagraph(String str) {
        return null;
    }

    @Override
    public Sentence parseSentence(String str) {
        return null;
    }

    @Override
    public Word parseWord(String str) {
        return null;
    }

    @Override
    public Character parseCharacter(String str) {
        return null;
    }
}
