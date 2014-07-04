package com.epam.as.textparser.util;

import com.epam.as.textparser.entity.Text;

public class Test {
    public static void main(String[] args) {
        String text = "♥☺☻:[]<>Lorem ipsum dolor sit amet\n" +
                "Nulla facilisi. vel lacinia lectus scelerisque.\n" +
                "\n" +
                "Vivamus ean posuere convallis pellentesque. \n" +
                "\n" +
                "\n" +
                "Donec at122145 h ☺☻";

        Text wrd = Parser.parseText(text);
        System.out.println("wrd = " + wrd);
    }
}
