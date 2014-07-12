package com.epam.as.textparser.parser;

import java.util.HashMap;
import java.util.Iterator;

public class Indexer implements Iterable<String> {
    HashMap<Integer, String> breakPoints;

    private class Itr implements Iterator<String> {
        private int size = 0;
        private int index = 0;
        private Indexer indexer;

        private Itr(Indexer ind) {
            indexer = ind;
            size = indexer.breakPoints.size();
        }

        @Override
        public boolean hasNext() {
            return (index < size);
        }

        @Override
        public String next() {
            return indexer.breakPoints.get(index++);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Itr(this);
    }
}
