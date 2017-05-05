package com.example.android.musicalstructureapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BuySongsActivity extends AppCompatActivity {
    ListView recentSongs;

    // Create a list of songs
    ArrayList<String> songs = new ArrayList<>();

    Button proceedToCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_songs_layout);

        proceedToCheck = (Button) findViewById(R.id.proceedToCheck);
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

        proceedToCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature needs to be implemented",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}
