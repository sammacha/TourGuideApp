package com.example.android.tourguide;

public class Details {

    /** string resource id for the icon */
    private int mIconId;

    /** description of the icon's meaning */
    private int mDescription;

    public Details(int iconId, int descriprition){
        mIconId = iconId;
        mDescription = descriprition;
    }

    public int getIconId() {
        return mIconId;
    }

    public int getDescriprition (){
        return mDescription;
    }

}
