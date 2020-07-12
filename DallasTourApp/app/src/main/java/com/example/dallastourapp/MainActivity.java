package com.example.dallastourapp;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar();

        //To create the adapter that will return a fragment for each section of the
        //activity.
        SegmentPagerAdapter mSegmentPagerAdapter = new SegmentPagerAdapter(getSupportFragmentManager());

        //Put in place ViewPager with the segment adapter.
        ViewPager mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSegmentPagerAdapter);

        TabLayout tabLayout =findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
    }

    private void setSupportActionBar() {
    }


}
