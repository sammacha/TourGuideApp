package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class SitesFragment extends android.support.v4.app.Fragment {


    public SitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sites,container,false);

        ArrayList <Details> details = new ArrayList<Details>();
        details.add(new Details(R.drawable.location, R.string.sydney_australia));
        details.add(new Details(R.drawable.phone,R.string.opera_number));
        details.add(new Details(R.drawable.alarm,R.string.opera_opening));
        details.add(new Details(R.drawable.email,R.string.opera_email));

        DetailsAdapter adapter = new DetailsAdapter(getActivity(),details);

        ListView listView = (ListView)rootView.findViewById(R.id.opera_list);
        listView.setAdapter(adapter);

        ArrayList <Details> cathDetails = new ArrayList<Details>();
        cathDetails.add(new Details(R.drawable.location,R.string.cath_location));
        cathDetails.add(new Details(R.drawable.phone,R.string.cath_phone));
        cathDetails.add(new Details(R.drawable.alarm,R.string.cath_opening));
        cathDetails.add(new Details(R.drawable.man,R.string.cath_architect));
        cathDetails.add(new Details(R.drawable.design,R.string.architectural_style));
        cathDetails.add(new Details(R.drawable.height,R.string.height));
        DetailsAdapter cathAdapter = new DetailsAdapter(getActivity(),cathDetails);
        ListView ltView = (ListView)rootView.findViewById(R.id.cathedral_list);
        ltView.setAdapter(cathAdapter);

        return  rootView;


    }

}