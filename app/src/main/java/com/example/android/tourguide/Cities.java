package com.example.android.tourguide;

public class Cities {

    private int mCityId;

    private  int mHeading;

    private int mDescription;

    public Cities (int cityId,int heading, int description){
        mCityId = cityId;
        mHeading = heading;
        mDescription = description;
    }

    public  int getmCityId(){
        return mCityId;
    }
    public int getmHeading(){
        return  mHeading;
    }
    public  int getmDescription(){
        return mDescription;
    }
}


