package com.epam.as.textparser.util;

import com.epam.as.textparser.entity.*;
import com.epam.as.textparser.parser.Indexer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       // String text = "♥☺☻:[]<>Lorem ipsum dolor sit amet\n" +
       //         "Nulla facilisi. vel lacinia lectus scelerisque.\n" +
       //         "\n" +
       //         "Vivamus ean posuere convallis pellentesque. \n" +
       //         "\n" +
       //         "\n" +
       //         "Donec at122145 h ☺☻";
//
        String text = "0\n Fsgs1fg. \n ggs.\nAa15df.\n\n Adaf";
        //Text wrd = Parser.parseText(text);
        // System.out.println("wrd = " + wrd);


        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("twi");
        list.add("trhee");
        Paragraph par0 = new Paragraph();
        Paragraph par1 = new Paragraph(Arrays.asList(new Sentence(Arrays.asList(new Word(Arrays.asList(new Symbol()))))));
        Text txt0 = new Text();
        Text txt1 = new Text(Arrays.asList(par0, par1));
        System.out.println("txt0 = " + txt0);
        System.out.println("txt1 = " + txt1);
        Sentence sent = new Sentence();
        System.out.println("txt0 = " + txt1.getElement(0));
        Indexer indx = new Indexer();
        indx.index(Paragraph.class, text);
        indx.index(Sentence.class, text);
        indx.index(Word.class, text);
        indx.index(Symbol.class, text);
    }
}
