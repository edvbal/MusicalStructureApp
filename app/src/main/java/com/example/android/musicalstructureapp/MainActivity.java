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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ImageView playList1;
    ImageView playList2;
    ImageView playListAdd;
    TabLayout tabLayout;

    ListView recentSongs;

    // Create ArrayList for songs
    ArrayList<String> songs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name);
        setContentView(R.layout.main_layout);

        playList1 = (ImageView) findViewById(R.id.playlist1);
        playList2 = (ImageView) findViewById(R.id.playlist2);
        playListAdd = (ImageView) findViewById(R.id.playlistAdd);

        recentSongs = (ListView) findViewById(R.id.listView);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        // Set up ListView with our ArrayAdapter that is filled with songs from ArrayList
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
                Intent intent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(intent);
            }
        });

        playList1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });
        playList2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });
        playListAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Feature needs to be implemented", Toast.LENGTH_SHORT).show();
            }
        });
        // Selects Intent method depending on which TabLayout item is pressed
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tabLayout.getSelectedTabPosition()) {
                    case 0:
                        return;
                    case 1:
                        nowPlayingActivity();
                        return;
                    case 2:
                        favoritesActivity();
                        return;
                    case 3:
                        searchActivity();
                        return;
                    case 4:
                        shoppingActivity();
                        return;
                    default:
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    /**
     * Methods to launch explicit Intent to other Activity in this app
     */
    private void searchActivity() {
        Intent i = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(i);
    }

    private void favoritesActivity() {
        Intent i = new Intent(MainActivity.this, FavoritesActivity.class);
        startActivity(i);
    }

    private void shoppingActivity() {
        Intent i = new Intent(MainActivity.this, BuySongsActivity.class);
        startActivity(i);
    }

    private void nowPlayingActivity() {
        Intent i = new Intent(MainActivity.this, NowPlayingActivity.class);
        startActivity(i);
    }
}

