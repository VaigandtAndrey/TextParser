package com.epam.as.textparser.entity;

import java.util.List;

public class Text extends AbstractCompoundText<Paragraph> {

    public Text(List<Paragraph> components) {
        super(components);
    }

    public Text() {
        super();
    }

}
