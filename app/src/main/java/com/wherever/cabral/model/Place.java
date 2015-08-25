package com.wherever.cabral.model;

import java.io.Serializable;

/**
 * Created by Gustavo on 8/24/15.
 */
public class Place implements Serializable{
    private String mName;
    private String mType;
    private String mDistance;

    public Place(String name, String type, String distance) {
        mName = name;
        mType = type;
        mDistance = distance;
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
