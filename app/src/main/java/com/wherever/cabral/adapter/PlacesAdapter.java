package com.wherever.cabral.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wherever.cabral.PlaceDetailActivity;
import com.wherever.cabral.R;
import com.wherever.cabral.model.Place;

import java.util.ArrayList;

/**
 * Created by Gustavo on 8/24/15.
 */
public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder> {

    private ArrayList<Place> mList = new ArrayList<Place>();

    public PlacesAdapter(ArrayList<Place> mList) {
        this.mList = mList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_item, viewGroup, false);
        ViewHolder vh = new ViewHolder(view, viewGroup.getContext());
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        if(mList.size() > 0) {
            Place place = mList.get(i);
            holder.bindPlace(place);
            holder.mName.setText(place.getName());
            holder.mType.setText(place.getType());
            holder.mDistance.setText(place.getDistance());
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // each data item is just a string in this case
        public TextView mName;
        public TextView mType;
        public TextView mDistance;
        private Context mContext;
        public Place place;

        public ViewHolder(View view, Context context) {
            super(view);
            mName = (TextView) view.findViewById(R.id.name);
            mType = (TextView) view.findViewById(R.id.type);
            mDistance = (TextView) view.findViewById(R.id.distance);
            mContext = context;
            view.setOnClickListener(this);
        }

        public void bindPlace(Place place) {
            this.place = place;
        }

        @Override
        public void onClick(View v) {
            if(place != null) {
                Intent intent = new Intent(mContext, PlaceDetailActivity.class);
                intent.putExtra("place", place);
                mContext.startActivity(intent);
            }
        }
    }
}
