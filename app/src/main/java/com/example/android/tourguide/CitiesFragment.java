package com.example.android.tourguide;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CitiesFragment extends android.support.v4.app.Fragment {


    public CitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_cities, container, false);

        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities.add(new Cities(R.drawable.melbourne,R.string.melbourne_heading,R.string.melbourne));
        cities.add(new Cities (R.drawable.adelaide,R.string.adelaide_heading,R.string.adelaide));
        cities.add(new Cities(R.drawable.darwin,R.string.darwin_heading,R.string.darwin));
        cities.add(new Cities(R.drawable.wollongong,R.string.wollongong_heading,R.string.wollongong));
        cities.add(new Cities(R.drawable.perth,R.string.perth_heading,R.string.perth));
        cities.add(new Cities(R.drawable.newcastle,R.string.newcatle_heading,R.string.newcastle));
        cities.add(new Cities(R.drawable.brisbane,R.string.bridge_heading,R.string.brisbane));

        CitiesAdapter adapter = new CitiesAdapter(getContext(),cities);
        ListView listView = (ListView)rootView.findViewById(R.id.city_list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
