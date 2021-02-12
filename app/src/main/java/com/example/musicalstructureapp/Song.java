package com.example.musicalstructureapp;

public class Song {
    // Name of the song */
    private String mSongName;

    /** Name of the artist*/
    private String mArtistName;

    // song duration
    private String mTimeSong;

    //Drawable resource ID
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param songName is the name of the song
     * @param artistName is the name of the artist
     * @param timeSong is the duration of the song
     * @param imageResourceId is drawable reference ID that correspond to the album
     */
    public Song (String songName, String artistName, String timeSong, int imageResourceId) {
        mSongName = songName;
        mArtistName = artistName;
        mTimeSong = timeSong;
        mImageResourceId = imageResourceId;
    }

    // Get the name of the song
    public String getSongName() {
        return mSongName;
    }

    // Get the name of the artist
    public String getArtistName() {
        return mArtistName;
    }

    // Get the duration of the song
    public String getTimeSong() {
        return mTimeSong;
    }

    // Get the image resource ID
    public int getImageResourceId() {
        return mImageResourceId;
    }

}


