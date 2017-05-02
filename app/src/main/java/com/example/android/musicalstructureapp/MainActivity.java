package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    ImageView playPause;
    ImageView prevSong;
    ImageView nextSong;
    ImageView songImage;

    TabLayout tabLayout;
    boolean isPlayButtonActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name);
        setContentView(R.layout.main_playlists);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tabLayout.getSelectedTabPosition()) {
                    case 0:
                        homeActivity();
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
                        homeActivity();
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
     * Launching new activity from menu
     */
    private void homeActivity() {
        Intent i = new Intent(MainActivity.this, MainActivity.class);
        startActivity(i);
    }

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

