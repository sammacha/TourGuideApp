package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class AttractionsAdapter extends FragmentPagerAdapter {

    // Context of the app
    private Context mContext;

    public AttractionsAdapter (Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SitesFragment();
        } else if (position == 1) {
            return new RocksFragment();
        } else if (position == 2) {
            return new CitiesFragment();
        } else {
            return new InfoFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.sites);
        } else if (position == 1) {
            return mContext.getString(R.string.rocks);
        } else if (position == 2) {
            return mContext.getString(R.string.cities);
        } else {
            return mContext.getString(R.string.info);
        }
    }

}
