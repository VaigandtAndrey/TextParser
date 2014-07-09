package com.epam.as.textparser.util;

import com.epam.as.textparser.entity.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Parser {
    private final static Logger log = LoggerFactory.getLogger(Parser.class);

    public static Text parseText(String sourceText) {
        return null;
    }

    public static String[] test(String reqText) {
        RegExPatternManager pm = new RegExPatternManager("regex.properties");

        String[] lines = reqText.split(pm.getPattern("sentence"));

        return lines;
    }
/*
    public static Text parseText(String submittedText) {
        String textStr = clean(submittedText);
        Text text = new Text(textStr);
        return text;
    }

    public static List<Paragraph> parseParagraphs(String submittedText) {
        String textStr = safe(submittedText);
        String lines[] = textStr.split("\\n+");
        List<Paragraph> pars = new ArrayList<>();
        for (String line : lines) {
            pars.add(new Paragraph(line));
        }
        return pars;
    }

    public static List<Sentence> parseSentences(String submittedText) {
        String textStr = clean(submittedText);
        String[] lines = textStr.split("[.!?]+");//todo check if site www.example.com
        List<Sentence> sents = new ArrayList<>();
        for (String line : lines) {
            sents.add(new Sentence(line));
        }
        return sents;
    }

    public static List<Word> parseWords(String submittedText) {
        List<Word> words = new ArrayList<>();
        String textStr = clean(submittedText);
        Pattern p = Pattern.compile("[а-яА-ЯёЁa-zA-Z]+");
        Matcher m = p.matcher(textStr);
        while (m.find()) {
            String[] group = m.group().split("\\s");
            for (String line : group) {
                words.add(new Word(line));
            }
        }
        return words;
    }

    public static List<Letter> parseLetters(String submittedText) {
        List<Letter> letters = new ArrayList<>();
        String textStr = clean(submittedText);
        Pattern p = Pattern.compile("[а-яА-ЯёЁa-zA-Z]");
        Matcher m = p.matcher(textStr);
        while (m.find()) {
            String[] group = m.group().split("\\s");
            for (String line : group) {
                letters.add(new Letter(line));
            }
        }
        return letters;
    }

    public static List<Number> parseNumbers(String submittedText) {
        String textStr = clean(submittedText);
        ResourceBundle formatBundle = ResourceBundle.getBundle("i18n.format"); //todo change it!
        String regex = "[0-9]\\\\" + formatBundle.getString("float.divider") + "[0-9]|[0-9]";
        String[] lines = textStr.split(regex);
        List<Number> numbers = new ArrayList<>();
        for (String line : lines) {
            numbers.add(new Number(line));
        }
        return numbers;
    }

    public static List<Symbol> parseSymbols(String submittedText) {
        String textStr = clean(submittedText);
        String[] lines = textStr.split("[^\\w\\sа-яА-ЯёЁa-zA-Z\\,\\.\\!\\?]");
        List<Symbol> symbols = new ArrayList<>();
        for (String line : lines) {
            symbols.add(new Symbol(line));
        }
        return symbols;
    }

    public static String clean(String textStr) {
        textStr = textStr.replaceAll("<|>|\\t|\\s+", " ");
        return textStr;
    }

    public static String safe(String textStr) {
        textStr = textStr.replaceAll("<|>", " ");
        return textStr;
    }
*/

}
