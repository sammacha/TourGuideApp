package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CitiesAdapter extends ArrayAdapter<Cities> {
    public CitiesAdapter(Context context, ArrayList<Cities> cities) {
        super(context, 0, cities);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.cities_list, parent, false);
        }
        Cities currentCity = getItem(position);

        ImageView barIcon = (ImageView) listItemView.findViewById(R.id.city_icon);
        barIcon.setImageResource(currentCity.getmCityId());

        TextView heading = (TextView) listItemView.findViewById(R.id.city_heading);
        heading.setText(currentCity.getmHeading());

        TextView description = (TextView) listItemView.findViewById(R.id.city_descriprition);
        description.setText(currentCity.getmDescription());
        return  listItemView;
    }
}
