package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class NowPlayingActivity extends AppCompatActivity {

    ImageView backToHome;
    ImageView makeFavorite;
    ImageView playSong;
    ImageView shuffle;
    ImageView prevSong;
    ImageView nextSong;
    ImageView repeat;
    ImageView addToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing_layout);

        backToHome = (ImageView) findViewById(R.id.backToHome);
        makeFavorite = (ImageView) findViewById(R.id.makeFavorite);
        playSong = (ImageView) findViewById(R.id.playSong);
        shuffle = (ImageView) findViewById(R.id.shuffle);
        prevSong = (ImageView) findViewById(R.id.prevSong);
        nextSong = (ImageView) findViewById(R.id.nextSong);
        repeat = (ImageView) findViewById(R.id.repeat);
        addToCart = (ImageView) findViewById(R.id.addToCart);

        backToHome.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        shuffle.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature needs to be implemented",Toast.LENGTH_SHORT).show();
            }
        });
        makeFavorite.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature needs to be implemented",Toast.LENGTH_SHORT).show();
            }
        });
        playSong.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature needs to be implemented",Toast.LENGTH_SHORT).show();
            }
        });
        prevSong.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature needs to be implemented",Toast.LENGTH_SHORT).show();
            }
        });
        nextSong.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature needs to be implemented",Toast.LENGTH_SHORT).show();
            }
        });
        repeat.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature needs to be implemented",Toast.LENGTH_SHORT).show();
            }
        });
        addToCart.setOnClickListener(new View.OnClickListener() {
            //@Override
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
