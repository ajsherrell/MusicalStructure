package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_list);

        // array list of artists
        ArrayList<Display> displays = new ArrayList<>();

        // add elements to array list
        displays.add(new Display("Born This Way", "Lady Gaga"));
        displays.add(new Display("Don't Let Me Down", "The Chain Smokers"));
        displays.add(new Display("The Sound of Silence", "Disturbed"));
        displays.add(new Display("After The Storm", "Mumford & Sons"));
        displays.add(new Display("Fade Into You", "Nashville"));
        displays.add(new Display("Ride", "SoMo"));
        displays.add(new Display("I Know Places", "Taylor Swift"));
        displays.add(new Display("New Rules", "Dua Lipa"));
        displays.add(new Display("Overjoyed", "Bastille"));
        displays.add(new Display("Wildest Dreams", "Taylor Swift"));


        // Create an {@link DisplayAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        DisplayAdapter adapter = new DisplayAdapter(this, displays);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }

}
