package com.epam.as.textparser.action;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    private final static Map<String, Action> actions = new HashMap<>();

    static {
        actions.put("parse", new ParseAction());
        actions.put("action1", new SortBySentenceLength());
    }

    public static Action getAction(String actionName) {
        return actions.get(actionName);
    }
}
