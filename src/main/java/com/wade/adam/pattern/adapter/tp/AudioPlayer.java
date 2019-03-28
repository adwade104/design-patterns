package com.wade.adam.pattern.adapter.tp;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if("mp3".equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        else if("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }

    }

}
