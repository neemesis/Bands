package com.toshevski.android.bands;

/**
 * Created by l3ft on 11/15/15.
 */
public class Song {
    private String name;
    private String description;
    private int year;

    public Song(String name, String description, int year) {
        this.name = name;
        this.description = description;
        this.year = year;
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
}
