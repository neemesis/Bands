package com.toshevski.android.bands;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private static final String TAG = "D.INFO";

    private ArrayList<Band> bands;
    private int beforePosition = 0;

    // Activity Lifecycle Part

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "MainActivity:onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "MainActivity:onResume");
        LoadMainScreen();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "MainActivity:onPause");
        bands.clear();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "MainActivity:onDestroy");
    }

    // Methods Part

    private void LoadMainScreen() {
        bands = LoadBands.Load();
        BandAdapter ba = new BandAdapter(this, bands, LoadBands.getNames(bands));
        ListView lv = (ListView) findViewById(R.id.bandList);
        lv.setAdapter(ba);
        lv.setSelection(beforePosition);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                beforePosition = position;
                Intent i = new Intent(getApplicationContext(), ShowBand.class);
                i.putExtra("band", bands.get(position));
                startActivity(i);
            }
        });
    }
}
