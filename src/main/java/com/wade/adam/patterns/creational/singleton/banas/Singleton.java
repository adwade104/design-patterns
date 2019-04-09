package com.wade.adam.patterns.creational.singleton.banas;

import java.util.*;

public class Singleton {

    private static Singleton firstInstance = null;

    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};


    private List<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;

    private Singleton(){}

    public static Singleton getInstance() {

        if (firstInstance == null) {
            // If the instance isn't needed it isn't created
            // This is known as lazy instantiation

            if (firstThread){

                firstThread = false;

                try {
                    Thread.currentThread();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            synchronized (Singleton.class) { //Forces it to be a synchronized method until the first object is created,
                                            //and then it will cease to be synchronized class

                if(firstInstance == null) {
                    // If the instance isn't needed it isn't created
                    // This is known as lazy instantiation

                    firstInstance = new Singleton();
                    Collections.shuffle(firstInstance.letterList);
                }

            }

        }

        return firstInstance;
    }

    public List<String> getLetterList(){
        return firstInstance.letterList;
    }

    public List<String> getTiles(int numTiles){

        List<String> tilesToSend = new LinkedList<>();

        for(int i = 0; i <= numTiles; i++){
            tilesToSend.add(firstInstance.letterList.remove(0));
        }

        return tilesToSend;
    }

}
