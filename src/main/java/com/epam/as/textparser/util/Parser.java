package com.epam.as.textparser.util;

import com.epam.as.textparser.entity.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Parser {
    private Text text;

    public String getSubmittedText() {
        return submittedText;
    }

    private String submittedText;
    private final static Logger log = LoggerFactory.getLogger(Parser.class);

    public Parser(String formSubmit) {
        this.text= new Text();
        this.submittedText = formSubmit;
        parse();
    }

    public void parse() {
        parseText();
    }

    public void parseText() {
        submittedText = submittedText.replaceAll("\\t|\\s+", " ");
        this.text = new Text(submittedText);
    }

    public String[] parseParagraphs() {
        String lines[] = submittedText.split("\\r?\\n");
        // String[] lines = submittedText.split("\\n\\n");
        for (String line : lines) {
            log.info(line);
        }
        return lines;
    }

    public String[] parseSentences(){
       String[] lines = submittedText.split("[.!?]");
       for (String line : lines) {
           log.info(line);
       }
       return lines;
   }


    //TODO show paragraphs
}
