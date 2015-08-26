package com.wherever.cabral.model;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by Gustavo on 8/24/15.
 */
public class Place implements Serializable{
    private String mName;
    private String mType;
    private String mDistance;
    private int mImage;

    public Place(String name, String type, String distance, int image) {
        mName = name;
        mType = type;
        mDistance = distance;
        mImage = image;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDistance() {
        return mDistance;
    }

    public void setDistance(String distance) {
        mDistance = distance;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }
}
