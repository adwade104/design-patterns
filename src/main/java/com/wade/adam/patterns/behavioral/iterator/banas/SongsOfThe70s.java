package com.wade.adam.patterns.behavioral.iterator.banas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongsOfThe70s implements SongIterator{

    private List<SongInfo> bestSongs;

    public SongsOfThe70s() {
        this.bestSongs = new ArrayList<>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "DonMcLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);

    }

    private void addSong(String songName, String bandName, int yearReleased){
        bestSongs.add(new SongInfo(songName, bandName, yearReleased));
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
