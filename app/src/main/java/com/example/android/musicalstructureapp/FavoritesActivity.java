package com.example.android.musicalstructureapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {
    ListView recentSongs;

    // Create ArrayList for songs
    ArrayList<String> songs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorites_layout);

        // Set up ListView with our ArrayAdapter that is filled with songs from ArrayList
        recentSongs = (ListView) findViewById(R.id.listView);
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        ArrayAdapter<String> songsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songs);
        recentSongs.setAdapter(songsAdapter);
        // When clicked on ListView item Intent is being sent to NowPlayingActivity
        recentSongs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FavoritesActivity.this, NowPlayingActivity.class);
                startActivity(intent);
            }
        });
    }

    // Phone back button will return to MainActivity
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

}
