package com.example.android.musicalstructure;

public class Display {

    // song name
    private String mSong;

    // artist name
    private String mInfo;

    // constructs display object with initial values
    public Display(String song, String info) {
        mSong = song;
        mInfo = info;
    }

    // get song
    public String getSong() {
        return mSong;
    }

    // get artist
    public String getInfo() {
        return mInfo;
    }

}
