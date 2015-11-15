package com.toshevski.android.bands;

import java.util.ArrayList;

/**
 * Created by l3ft on 11/15/15.
 */
public class Band {
    private String name;
    private ArrayList<Song> songs;
    private String description;
    private int ID;

    public Band(String name, String description, int ID){
        this.name = name;
        this.description = description;
        this.songs = new ArrayList<Song>();
        this.ID = ID;
    }

    public void addSong(Song s) {
        songs.add(s);
    }

    public String getName() {
        return name;
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }
    public String getDescription() {
        return description;
    }
    public int getID() {
        return ID;
    }
}
