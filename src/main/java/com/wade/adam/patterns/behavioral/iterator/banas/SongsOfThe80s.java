package com.wade.adam.patterns.behavioral.iterator.banas;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {

    private SongInfo[] bestSongs;
    private int arrayValue = 0;

    public SongsOfThe80s() {
        this.bestSongs = new SongInfo[3];


        addSong("Roam", "B52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);

    }

    private void addSong(String songName, String bandName, int yearReleased){
        bestSongs[arrayValue] = new SongInfo(songName, bandName, yearReleased);
        arrayValue++;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
