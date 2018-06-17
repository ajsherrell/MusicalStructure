package com.example.android.musicalstructure;

public class Display {

    // song name
    private String mSong;

    // artist name
    private String mArtist;

    // constructs display object with initial values
    public Display(String song, String artist) {
        mSong = song;
        mArtist = artist;
    }

    // get song
    public String getSong() {
        return mSong;
    }

    // get artist
    public String getArtist() {
        return mArtist;
    }

}
