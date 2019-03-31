package com.wade.adam.pattern.iterator.banas;

import java.util.Iterator;

public class DiskJockey {

    private SongIterator iter70sSongs;
    private SongIterator iter80sSongs;
    private SongIterator iter90sSongs;

    public DiskJockey(SongIterator iter70sSongs, SongIterator iter80sSongs, SongIterator iter90sSongs) {
        this.iter70sSongs = iter70sSongs;
        this.iter80sSongs = iter80sSongs;
        this.iter90sSongs = iter90sSongs;
    }

    public void showTheSongs(){

        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter80sSongs.createIterator();
        Iterator songs90s = iter90sSongs.createIterator();

        System.out.println("Songs Of The 70s");
        printSongs(songs70s);

        System.out.println("Songs Of The 80s");
        printSongs(songs80s);

        System.out.println("Songs Of The 90s");
        printSongs(songs90s);

    }

    private void printSongs(Iterator iterator){

        while (iterator.hasNext()){
            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
            System.out.println();

        }


    }


}
