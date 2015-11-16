package com.toshevski.android.bands;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by l3ft on 11/15/15.
 */

public class AlbumAdapter extends ArrayAdapter<String> {
    private ArrayList<Album> albums;
    private LayoutInflater inflater;

    static class ViewHolder {
        private ImageView albumCoverImg;

        public ViewHolder(View v) {
            albumCoverImg = (ImageView) v.findViewById(R.id.bandCoverImg);
        }
    }

    public AlbumAdapter(Context context, ArrayList<Album> albums, String[] names) {
        super(context, R.layout.bandrowlayout, names);
        this.albums = albums;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.bandrowlayout, parent, false);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Album album = albums.get(position);
        vh.albumCoverImg.setImageResource(album.getArtworkID());

        return convertView;
    }
}
