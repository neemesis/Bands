package com.toshevski.android.bands;

import java.io.Serializable;

/**
 * Created by l3ft on 11/16/15.
 */
public class Song implements Serializable {
    private String name;
    private String description;
    private int duration;

    public Song(String name, int duration, String description) {
        this.name = name;
        this.duration = duration;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }
}
