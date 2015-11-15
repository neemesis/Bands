package com.toshevski.android.bands;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
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

public class BandAdapter extends ArrayAdapter<String> {
    private Context context;
    private ArrayList<Band> bands;
    private LayoutInflater inflater;
    private HashMap<Integer, View> viewMap;

    static class ViewHolder {
        private ImageView bandCoverImg;

        public ViewHolder(View v) {
            bandCoverImg = (ImageView) v.findViewById(R.id.bandCoverImg);
        }
    }

    public BandAdapter(Context context, ArrayList<Band> bands, String[] names) {
        super(context, R.layout.bandrowlayout, names);
        this.context = context;
        this.bands = bands;
        viewMap = new HashMap<>();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;

        if (convertView == null) {
//            if (viewMap.containsKey(position)) {
//                convertView = viewMap.get(position);
//            } else {
//                convertView = inflater.inflate(R.layout.bandrowlayout, parent, false);
//                viewMap.put(position, convertView);
//            }
            convertView = inflater.inflate(R.layout.bandrowlayout, parent, false);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }



        // vh.bandCoverImg = (ImageView) rowView.findViewById(R.id.bandCoverImg);

        Band band = bands.get(position);
        vh.bandCoverImg.setImageResource(band.getID());

        return convertView;
    }
}