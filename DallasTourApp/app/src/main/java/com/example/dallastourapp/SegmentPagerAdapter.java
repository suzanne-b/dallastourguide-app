package com.example.dallastourapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SegmentPagerAdapter  extends FragmentPagerAdapter {

    SegmentPagerAdapter(FragmentManager fm) {super(fm);}

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new RestaurantsFragment();
            case 1:
                return new ShoppingFragment();
            case 2:
                return new ConcertsFragment();
            default:
                return new SightseeingFragment();

        }
    }
    /**
     * Get the total number of fragments
     * @return number of fragments
     *
     */
    @Override
    public int getCount (){return 4;}
}
