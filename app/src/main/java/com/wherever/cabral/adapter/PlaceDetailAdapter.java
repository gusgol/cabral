package com.wherever.cabral.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.wherever.cabral.fragment.PlaceHistoryFragment;
import com.wherever.cabral.fragment.PlaceInfoFragment;
import com.wherever.cabral.fragment.PlaceMapFragment;

/**
 * Created by Gustavo on 8/25/15.
 */
public class PlaceDetailAdapter extends FragmentStatePagerAdapter {
    public PlaceDetailAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if(position == 1) {
            fragment = new PlaceInfoFragment();
        } else if (position == 0) {
            fragment = new PlaceHistoryFragment();
        } else if (position ==2) {
            fragment = new PlaceMapFragment();
        } else if (position ==3 ) {
            fragment = new PlaceMapFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 1) {
            return "informações".toUpperCase();
        } else if (position == 0) {
            return "história".toUpperCase();
        } else if (position == 2) {
            return "mapa".toUpperCase();
        } else if (position == 3) {
            return "fotos".toUpperCase();
        }
        return "";
    }
}
