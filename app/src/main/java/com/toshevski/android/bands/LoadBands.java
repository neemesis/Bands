package com.toshevski.android.bands;

import java.util.ArrayList;

/**
 * Created by l3ft on 11/15/15.
 */
public class LoadBands {

    public static ArrayList<Band> Load() {
        ArrayList<Band> b = new ArrayList<>();

        Band foolishGreen = new Band("Foolish Green", "Opis 1", "Genre", R.drawable.foolishgreen);
        Band pmg = new Band("PMG Kolektiv", "Opis 1", "Genre", R.drawable.pmgkolektiv);
        Band foltin = new Band("Foltin", "Opis 1", "Genre", R.drawable.foltin);
        Band stringForces = new Band("String Forces", "Opis 1", "Genre", R.drawable.stringforces);
        Band galatheia = new Band("Galatheia", "Opis 1", "Genre", R.drawable.galatheia);
        Band beiTheFish = new Band("Bei The Fish", "Opis 1", "Genre", R.drawable.beithefish);
        Band theJohn = new Band("The John", "Opis 1", "Genre", R.drawable.thejohn);
        Band robotek = new Band("Robotek", "Opis 1", "Genre", R.drawable.robotek);
        Band millko = new Band("Millko", "Opis 1", "Genre", R.drawable.millko);
        Band kirilDzhajkovski = new Band("Kiril Dzhajkovski", "Opis 1", "Genre", R.drawable.kirildzhajkovski);

        // Za albumite treba slika da se dodade vo konstruktorot.

        // foolishGreen.addAlbum(new Album("Album1", "Desc1", 1994));
        // foolishGreen.addAlbum(new Album("Album2", "Desc2", 1995));
        // pmg.addAlbum(new Album("Album1", "Desc1", 1994));
        // pmg.addAlbum(new Album("Album2", "Desc2", 1995));


        b.add(foolishGreen);
        b.add(kirilDzhajkovski);
        b.add(theJohn);
        b.add(millko);
        b.add(foltin);
        b.add(beiTheFish);
        b.add(galatheia);
        b.add(robotek);
        b.add(stringForces);
        b.add(pmg);

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
