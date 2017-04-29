package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends  FragmentActivity {

    ViewPager viewPager;
    FragmentAdapter fragmentAdapter;
    TabLayout tableLayout;

    ImageView playPause;
    ImageView prevSong;
    ImageView nextSong;
    ImageView songImage;

    boolean isPlayButtonActive = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name);
        setContentView(R.layout.activity_main);

        playPause = (ImageView) findViewById(R.id.playPause);
        prevSong = (ImageView) findViewById(R.id.prev_song);
        nextSong = (ImageView) findViewById(R.id.next_song);
        songImage = (ImageView) findViewById(R.id.song_image);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), MainActivity.this);
        viewPager.setAdapter(fragmentAdapter);

        tableLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tableLayout.setupWithViewPager(viewPager);

        playPause.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                changePlayToPause(isPlayButtonActive);
            }
        });
        prevSong.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature is coming in upcoming releases", Toast.LENGTH_SHORT).show();
            }
        });
        nextSong.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature is coming in upcoming releases", Toast.LENGTH_SHORT).show();
            }
        });
        songImage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                viewPager.setCurrentItem(3);
            }
        });


/* Animation that moves play now song text from left to right and right to left
   commenting because it does that even when the name is small and animation is not needed
        TranslateAnimation animation = new TranslateAnimation(0, songName.getTextSize() - 500, 0, 0);
        animation.setDuration(7000);
        animation.setRepeatMode(TranslateAnimation.REVERSE);
        animation.setRepeatCount(TranslateAnimation.INFINITE);
        songName.startAnimation(animation);
 */
    }
    public void changePlayToPause(boolean isPlayBttnPressed){
        if (!isPlayBttnPressed){
            playPause.setImageResource(R.drawable.play);
            isPlayButtonActive = true;
        }
        else if (isPlayBttnPressed){
            playPause.setImageResource(R.drawable.pause);
            isPlayButtonActive = false;
        }
    }
}

