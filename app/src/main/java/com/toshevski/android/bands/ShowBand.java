package com.toshevski.android.bands;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by l3ft on 11/16/15.
 */
public class ShowBand extends Activity {
    private static final String TAG = "D.INFO";

    private Band band;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_band);
        band = (Band) getIntent().getSerializableExtra("band");
    }

    @Override
    protected void onResume() {
        super.onResume();

        View header = getLayoutInflater().inflate(R.layout.band_description, null);
        TextView tv = (TextView) header.findViewById(R.id.bandDescription);
        tv.setTypeface(Typeface.createFromAsset(getAssets(), "CaviarDreams.ttf"));
        tv.setText(band.getDescription());

        AlbumAdapter aa = new AlbumAdapter(this, band.getAlbums(), band.getNamesofAlbums());
        ListView lv = (ListView) findViewById(R.id.albumList);
        if (lv.getHeaderViewsCount() == 0)
            lv.addHeaderView(header, null, false);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), ShowAlbum.class);
                i.putExtra("album", band.getAlbums().get(position - 1));
                i.putExtra("band", band.getName());
                startActivity(i);
            }
        });

    }
}
