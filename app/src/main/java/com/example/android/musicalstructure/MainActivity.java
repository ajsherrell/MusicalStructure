package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the text view for the songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                // start new activity
                startActivity(songsIntent);
            }
        });

        // find the text view for the favorites category
        TextView favorites = (TextView) findViewById(R.id.favorites);

        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent to open the {@link FavoritesActivity}
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);

                // start new activity
                startActivity(favoritesIntent);
            }
        });

    }
}
