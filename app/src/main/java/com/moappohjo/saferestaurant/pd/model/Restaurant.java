package com.moappohjo.saferestaurant.pd.model;

import androidx.annotation.Nullable;

import com.moappohjo.saferestaurant.R;


public class Restaurant implements Comparable<Restaurant> {
    public final int id;
    public final String name;
    public final String address;
    public final String type;
    public final String tell;
    public int image;

    public Restaurant(int id, String name, String address, String type, String tell) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.tell = tell;
        this.image = imageOf(type);
        this.id = id;
    }

    private int imageOf(String type) {
        int ret = R.drawable.ic_food;
        switch (type) {
            case "":
                break;
            default:
                break;
        }
        return ret;
    }

    @Override
    public int compareTo(Restaurant o) {
       return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }
}
