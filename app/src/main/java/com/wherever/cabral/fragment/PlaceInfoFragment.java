package com.wherever.cabral.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wherever.cabral.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceInfoFragment extends Fragment {


    public PlaceInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_place_info, container, false);
    }


}
