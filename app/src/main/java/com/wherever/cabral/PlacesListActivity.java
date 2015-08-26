package com.wherever.cabral;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.wherever.cabral.adapter.PlacesAdapter;
import com.wherever.cabral.model.Place;

import java.util.ArrayList;

public class PlacesListActivity extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private PlacesAdapter mPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_list);
        mRecyclerView = (RecyclerView) findViewById(R.id.places_list);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mPlacesAdapter = new PlacesAdapter(this, getMockedPlaces());
        mRecyclerView.setAdapter(mPlacesAdapter);
    }

    private ArrayList<Place> getMockedPlaces() {
        ArrayList<Place> mList = new ArrayList<Place>();
        mList.add(new Place("Mercado Público", "Lugar", "50 metros", R.drawable.praca));
        mList.add(new Place("Rua da Praia", "Rua", "150 metros", R.drawable.rua_praia));
        mList.add(new Place("Teatro São Pedro", "Lugar", "250 metros", R.drawable.teatro));
        mList.add(new Place("Praça da Matriz", "Praça", "250 metros",R.drawable.praca));
        mList.add(new Place("Parque da Redenção", "Parque", "650 metros", R.drawable.redencao));
        return mList;

    }

}
