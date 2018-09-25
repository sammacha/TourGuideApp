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

public class RocksFragment extends android.support.v4.app.Fragment {


    public RocksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rocks,container,false);

        ArrayList<Details> details = new ArrayList<Details>();
        details.add(new Details(R.drawable.george,R.string.royal_george));
        details.add(new Details(R.drawable.edinburg,R.string.edinburgh));
        details.add(new Details(R.drawable.darling,R.string.darling));
        details.add(new Details(R.drawable.mountain,R.string.mountain));

        PubDetailsAdapter adapter = new PubDetailsAdapter(getActivity(),details);
        ListView listView = (ListView)rootView.findViewById(R.id.pub_list);
        listView.setAdapter(adapter);

        return  rootView;
    }

}
