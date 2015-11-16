package com.toshevski.android.bands;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by l3ft on 11/15/15.
 */
public class Album implements Serializable {
    private String name;
    private String description;
    private int year;
    private int artworkID;
    private ArrayList<Song> songs;

    public Album(String name, String description, int year, int artworkID) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.artworkID = artworkID;
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public int getArtworkID() {
        return artworkID;
    }
}
