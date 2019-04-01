package com.wade.adam.pattern.composite.banas;

public class DiscJockey {

    private SongComponent songList;

    public DiscJockey(SongComponent songList) {
        this.songList = songList;
    }

    public void getSongList() {
        songList.displaySongInfo();
    }

}
