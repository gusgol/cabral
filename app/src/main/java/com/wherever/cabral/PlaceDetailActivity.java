package com.wherever.cabral;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.wherever.cabral.adapter.PlaceDetailAdapter;
import com.wherever.cabral.model.Place;
import com.wherever.cabral.view.SlidingTabLayout;

public class PlaceDetailActivity extends FragmentActivity {

    private TextView mName;
    private TextView mType;
    private TextView mDistance;

    private Place mPlace;

    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);


        mName = (TextView) findViewById(R.id.name);
        mType = (TextView) findViewById(R.id.type);
        mDistance = (TextView) findViewById(R.id.distance);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(new PlaceDetailAdapter(getSupportFragmentManager()));

        mSlidingTabLayout = (SlidingTabLayout) findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setViewPager(mViewPager);

        mPlace = (Place) getIntent().getSerializableExtra("place");
        if(mPlace != null) {
            mName.setText(mPlace.getName());
            mType.setText(mPlace.getType());
            mDistance.setText(mPlace.getDistance());
        }
    }


}
