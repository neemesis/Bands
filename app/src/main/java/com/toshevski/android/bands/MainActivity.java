package com.toshevski.android.bands;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ArrayList<Band> bands;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bands = LoadBands.Load();
        BandAdapter ba = new BandAdapter(this, bands, LoadBands.getNames(bands));
        ListView lv = (ListView) findViewById(R.id.bandList);
        lv.setAdapter(ba);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
