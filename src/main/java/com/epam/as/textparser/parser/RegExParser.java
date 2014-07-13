package com.epam.as.textparser.parser;

import com.epam.as.textparser.entity.*;
import com.epam.as.textparser.util.RegExPatternManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegExParser implements Parser {
    private final static Logger log = LoggerFactory.getLogger(Parser.class);

    public RegExParser() {

    }

    public String clean(String textStr) {
        RegExPatternManager pm = new RegExPatternManager("regex.properties");
        textStr = textStr.replaceAll(pm.getPattern("multiply.spaces"), " ");
        textStr = textStr.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        return textStr;
    }

    public Text parseText(String sourceText) {
        Text text = new Text();
        Indexer indxr = new Indexer();
        Paragraph parsedPar = new Paragraph();
        int startPoint = 0;
        int endPoint = 0;

        for (Integer breakPoint : indxr.index(Paragraph.class, sourceText)) {
            endPoint = breakPoint;
            parsedPar = parseParagraph(sourceText.substring(startPoint, endPoint));
            text.add(parsedPar);
            startPoint = endPoint;
        }

        return text;
    }

    @Override
    public Paragraph parseParagraph(String str) {

        Paragraph par = new Paragraph();
        Indexer indxr = new Indexer();
        Sentence parsedSent = new Sentence();
        int startPoint = 0;
        int endPoint = 0;

        for (Integer breakPoint : indxr.index(Sentence.class, str)) {
            endPoint = breakPoint;
            parsedSent = parseSentence(str.substring(startPoint, endPoint));
            par.add(parsedSent);
            startPoint = endPoint;
        }

        return par;
    }

    @Override
    public Sentence parseSentence(String str) {

        Sentence sent = new Sentence();
        Indexer indxr = new Indexer();
        Word parsedWord = new Word();
        int startPoint = 0;
        int endPoint = 0;

        for (Integer breakPoint : indxr.index(Word.class, str)) {
            endPoint = breakPoint;
            parsedWord = parseWord(str.substring(startPoint, endPoint));
            sent.add(parsedWord);
            startPoint = endPoint;
        }

        return sent;
    }

    @Override
    public Word parseWord(String str) {
        Word wrd = new Word();
        Indexer indxr = new Indexer();
        Symbol parsedSymb = new Symbol();
        int startPoint = 0;
        int endPoint = 0;

        for (Integer breakPoint : indxr.index(Symbol.class, str)) {
            endPoint = breakPoint;
            parsedSymb = parseSymbol(str.substring(startPoint, endPoint));
            wrd.add(parsedSymb);
            startPoint = endPoint;
        }

        return wrd;
    }

    @Override
    public Symbol parseSymbol(String str) {
        return null;
    }

    @Override
    public PunctuationMark parsePunctuationMark(String str) {
        return null;
    }

    @Override
    public WhiteSpace parseWhiteSpace(String str) {
        return null;
    }
}
