package com.epam.as.textparser.util;

import com.sun.org.apache.xerces.internal.impl.PropertyManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RegExPatternManager {
    private static final Properties PROPERTIES = new Properties();

    public RegExPatternManager(String filename) {
        // "regex.properties"
        InputStream stream = PropertyManager.class.getClassLoader().getResourceAsStream(filename);
        try {
            PROPERTIES.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPattern(String key) {
        return PROPERTIES.getProperty(key);
    }
}
