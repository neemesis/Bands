package com.toshevski.android.bands;

import android.app.Activity;
import android.os.Bundle;
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

        ImageView iv = (ImageView) findViewById(R.id.showBandCover);
        iv.setImageResource(band.getCoverID());

        TextView tv = (TextView) findViewById(R.id.bandDescription);
        tv.setText(band.getDescription());

        AlbumAdapter aa = new AlbumAdapter(this, band.getAlbums(), band.getNamesofAlbums());
        ListView lv = (ListView) findViewById(R.id.albumList);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(getApplicationContext(), band.getAlbums().get(position).getName(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
