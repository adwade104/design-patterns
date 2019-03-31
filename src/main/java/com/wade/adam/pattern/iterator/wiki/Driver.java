package com.wade.adam.pattern.iterator.wiki;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Driver {

    public static void main(String[] args){

        Iterator iterator = range(0, 10);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static Iterator<Integer> range(int start, int end) {
        return new Iterator<Integer>() {
            private int index = start;

            @Override
            public boolean hasNext() {
                return index < end;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return index++;
            }
        };
    }

}
