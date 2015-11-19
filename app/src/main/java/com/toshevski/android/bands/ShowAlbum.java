package com.toshevski.android.bands;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by l3ft on 11/19/15.
 */
public class ShowAlbum extends Activity {

    private Album album;
    private String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_album);
        album = (Album) getIntent().getSerializableExtra("album");
        name = (String) getIntent().getSerializableExtra("band");
    }

    @Override
    protected void onResume() {
        super.onResume();

        SongAdapter sa = new SongAdapter(this, album.getSongs(), album.getNames(), getAssets());

        ListView lv = (ListView) findViewById(R.id.showAlbumLV);
        lv.setAdapter(sa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.youtube.com/results?search_query=" + name + " " + album.getSongs().get(position).getName()));
                startActivity(i);
            }
        });
    }
}
