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

public class BandAdapter extends ArrayAdapter<String> {
    private ArrayList<Band> bands;
    private LayoutInflater inflater;

    static class ViewHolder {
        private ImageView bandCoverImg;

        public ViewHolder(View v) {
            bandCoverImg = (ImageView) v.findViewById(R.id.bandCoverImg);
        }
    }

    public BandAdapter(Context context, ArrayList<Band> bands, String[] names) {
        super(context, R.layout.bandrowlayout, names);
        this.bands = bands;
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

        Band band = bands.get(position);
        vh.bandCoverImg.setImageResource(band.getCoverID());

        return convertView;
    }
}
