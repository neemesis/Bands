package com.toshevski.android.bands;

import java.util.ArrayList;

/**
 * Created by l3ft on 11/15/15.
 */
public class Band {
    private String name;
    private ArrayList<Album> albums;
    private String description;
    private String genre;
    private int coverID;

    public Band(String name, String description, String genre, int coverID){
        this.name = name;
        this.description = description;
        this.albums = new ArrayList<>();
        this.genre = genre;
        this.coverID = coverID;
    }

    public void addAlbum(Album s) {
        albums.add(s);
    }

    public String getName() {
        return name;
    }
    public ArrayList<Album> getAlbums() {
        return albums;
    }
    public String getDescription() {
        return description;
    }
    public int getCoverID() {
        return coverID;
    }
    public String getGenre() {
        return genre;
    }
}
