package com.wherever.cabral;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

import com.wherever.cabral.model.Place;

public class PlaceDetailActivity extends Activity {

    private TextView mName;
    private TextView mType;
    private TextView mDistance;

    private Place mPlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);


        mName = (TextView) findViewById(R.id.name);
        mType = (TextView) findViewById(R.id.type);
        mDistance = (TextView) findViewById(R.id.distance);

        mPlace = (Place) getIntent().getSerializableExtra("place");
        if(mPlace != null) {
            mName.setText(mPlace.getName());
            mType.setText(mPlace.getType());
            mDistance.setText(mPlace.getDistance());
        }
    }


}
