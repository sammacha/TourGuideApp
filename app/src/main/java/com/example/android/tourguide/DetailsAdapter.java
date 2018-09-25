package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailsAdapter extends ArrayAdapter<Details> {

    public DetailsAdapter(Context context, ArrayList<Details> details) {
        super(context, 0, details);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Details currentDetail = getItem(position);

        ImageView icon = (ImageView)listItemView.findViewById(R.id.icon);
        icon.setImageResource(currentDetail.getIconId());

        TextView description = (TextView)listItemView.findViewById(R.id.description);
        description.setText(currentDetail.getDescriprition());

        return listItemView;

    }
}
