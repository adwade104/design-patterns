package com.wade.adam.patterns.structural.composite.banas;

public class Driver {

    public static void main(String[] args){

        /* Transparency vs Safety
          It is clearly stated in the Design Patterns book that implementing the child management operations in the
          component instead of in the composite (like Derek did here) is favoring transparency over safety. By default
          you have the child management operations fail, so that you can catch exceptions when they are called on leaves,
          (usually indicates a bug anyway), and you override them in the component to actually do what they should do.
          That way they both composite and leaves appear to have the same interface to the client.
          If you want to go for safety, sure, do what you said, but don't say that this implementation is actually
          an ANTI-PATTERN because it's really one of the default ways of implementing this pattern.
        */

        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal",
                "is a genre of electronic dance music that originated in South London, England");

        SongComponent industrialMusic = new SongGroup("Industrial",
                "is a style of experimental music that draws on transgressive and provocative themes");

        SongComponent dubstepMusic = new SongGroup("Dubstep Music",
                "is a genre of rock that developed in the late 1960s, largely in the UK and in the US");


        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));
        industrialMusic.add(dubstepMusic);

        SongComponent everySong = new SongGroup("Song List","Every Song Available");
        everySong.add(industrialMusic);
        everySong.add(heavyMetalMusic);

        DiscJockey crazyLarry = new DiscJockey(everySong);
        crazyLarry.getSongList();

    }

}
