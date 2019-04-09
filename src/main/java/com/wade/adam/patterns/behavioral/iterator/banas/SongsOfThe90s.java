package com.wade.adam.patterns.behavioral.iterator.banas;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {

    private Hashtable<Integer, SongInfo> bestSongs;
    private int hashKey = 0;

    public SongsOfThe90s() {
        this.bestSongs = new Hashtable<>();

        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radio Head", 1993);
        addSong("Walk On The Ocean", "Toad The Wet Sprocket", 1991);

    }

    private void addSong(String songName, String bandName, int yearReleased){
       bestSongs.put(hashKey, new SongInfo(songName, bandName, yearReleased));
       hashKey++;
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
