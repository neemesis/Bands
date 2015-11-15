package com.toshevski.android.bands;

import java.util.ArrayList;

/**
 * Created by l3ft on 11/15/15.
 */
public class LoadBands {

    public static ArrayList<Band> Load() {
        ArrayList<Band> b = new ArrayList<>();

        Band foolishGreen = new Band("Foolish Green", "Opis 1", R.drawable.foolishgreen);
        Band pmg = new Band("PMG Kolektiv", "Opis 1", R.drawable.pmgkolektiv);
        Band foltin = new Band("Foltin", "Opis 1", R.drawable.foltin);
        Band stringforces = new Band("String Forces", "Opis 1", R.drawable.stringforces);


        foolishGreen.addSong(new Song("Song1", "Desc1", 1994));
        foolishGreen.addSong(new Song("Song2", "Desc2", 1995));

        pmg.addSong(new Song("Song1", "Desc1", 1994));
        pmg.addSong(new Song("Song2", "Desc2", 1995));


        b.add(foolishGreen);
        b.add(pmg);
        b.add(foltin);
        b.add(stringforces);

        return b;
    }

    public static String[] getNames(ArrayList<Band> b) {
        String[] s = new String[b.size()];
        for (int i = 0; i < b.size(); ++i) {
            s[i] = b.get(i).getName();
        }
        return s;
    }
}
