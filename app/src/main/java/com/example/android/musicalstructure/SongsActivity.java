package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_list);

        // array list of songs
        ArrayList<Display> displays = new ArrayList<>();

        // add elements to array list
        displays.add(new Display("Born This Way", "Lady Gaga"));
        displays.add(new Display("Mr. Saxobeat", "Alexandra Stan"));
        displays.add(new Display("The Perfect Space", "The Avett Brothers"));
        displays.add(new Display("Laundry Room", "The Avett Brothers"));
        displays.add(new Display("Ill With Want", "The Avett Brothers"));
        displays.add(new Display("Pompeii", "Bastille"));
        displays.add(new Display("Overjoyed", "Bastille"));
        displays.add(new Display("The Luckiest", "Bens Folds"));
        displays.add(new Display("Don't Let Me Down", "The Chain Smokers"));
        displays.add(new Display("The Sound of Silence", "Disturbed"));
        displays.add(new Display("New Rules", "Dua Lipa"));
        displays.add(new Display("Wicked Game", "Gemma Hayes"));
        displays.add(new Display("Your Ghost", "Greg Laswell"));
        displays.add(new Display("Mirrors", "Justin Timberlake"));
        displays.add(new Display("She Has No Time", "Keane"));
        displays.add(new Display("Blackbird Song", "Lee DeWyze"));
        displays.add(new Display("What I've Done", "Linkin Park"));
        displays.add(new Display("The Cave", "Mumford & Sons"));
        displays.add(new Display("After The Storm", "Mumford & Sons"));
        displays.add(new Display("Uprising", "Muse"));
        displays.add(new Display("Resistance", "Muse"));
        displays.add(new Display("Fade Into You", "Nashville"));
        displays.add(new Display("Closer", "Nine Inch Nails"));
        displays.add(new Display("Sweater Weather", "The Neighborhood"));
        displays.add(new Display("Still Into You", "Paramore"));
        displays.add(new Display("The Heart Wants What It Wants", "Selena Gomez"));
        displays.add(new Display("Chandelier", "Sia"));
        displays.add(new Display("Ride", "SoMo"));
        displays.add(new Display("I Know Places", "Taylor Swift"));
        displays.add(new Display("Habits", "Tove Lo"));
        displays.add(new Display("Wildest Dreams", "Taylor Swift"));
        displays.add(new Display("This Hills", "The Weeknd"));


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
