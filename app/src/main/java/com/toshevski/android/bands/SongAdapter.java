package com.toshevski.android.bands;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by l3ft on 11/15/15.
 */

public class SongAdapter extends ArrayAdapter<String> {
    private ArrayList<Song> songs;
    private LayoutInflater inflater;
    private AssetManager assets;

    public SongAdapter(Context context, ArrayList<Song> songs, String[] names, AssetManager assets) {
        super(context, R.layout.song_layout, names);
        this.songs = songs;
        this.assets = assets;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.song_layout, parent, false);

        TextView number = (TextView) convertView.findViewById(R.id.songNumber);
        number.setTypeface(Typeface.createFromAsset(assets, "CaviarDreams.ttf"));
        number.setText(position + 1 + " ");

        TextView name = (TextView) convertView.findViewById(R.id.songName);
        name.setTypeface(Typeface.createFromAsset(assets, "CaviarDreams.ttf"));
        name.setText(songs.get(position).getName());

        TextView duration = (TextView) convertView.findViewById(R.id.songLength);
        duration.setText(songs.get(position).getDuration() / 60 + ":" + songs.get(position).getDuration() % 60);

        return convertView;
    }
}
