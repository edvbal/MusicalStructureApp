package com.example.android.musicalstructureapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.musicalstructureapp.Fragments.AlbumsFragment;
import com.example.android.musicalstructureapp.Fragments.ArtistsFragment;
import com.example.android.musicalstructureapp.Fragments.BuySongsFragment;
import com.example.android.musicalstructureapp.Fragments.GenresFragment;
import com.example.android.musicalstructureapp.Fragments.PlaylistFragment;
import com.example.android.musicalstructureapp.Fragments.TracksFragment;

/**
 * Created by Edvinas on 26/04/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    Context context;
    private String tabTitles[];
    final int PAGE_COUNT;
    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabTitles = new String[]{  context.getApplicationContext().getString(R.string.playlists),
                context.getString(R.string.tracks),
                context.getString(R.string.albums),
                context.getString(R.string.artists),
                context.getString(R.string.genres),
                context.getString(R.string.buyMoreSongs)};
        PAGE_COUNT = context.getResources().getInteger(R.integer.slideTabsCount);

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlaylistFragment();
        } else if (position == 1) {
            return new TracksFragment();
        } else if (position == 2) {
            return new AlbumsFragment();
        } else if (position == 3) {
            return new ArtistsFragment();
        } else if (position == 4) {
            return new GenresFragment();
        } else {
            return new BuySongsFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];

    }
}
