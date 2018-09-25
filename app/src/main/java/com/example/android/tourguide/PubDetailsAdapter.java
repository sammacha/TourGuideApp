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

public class PubDetailsAdapter extends ArrayAdapter<Details> {

    public PubDetailsAdapter (Context context, ArrayList<Details> details){
        super(context,0,details);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.bar_lists, parent, false);
        }

        Details currentDetail = getItem(position);
        ImageView barIcon = (ImageView) listItemView.findViewById(R.id.bar_icon);
        barIcon.setImageResource(currentDetail.getIconId());

        TextView description = (TextView) listItemView.findViewById(R.id.bar_description);
        description.setText(currentDetail.getDescriprition());

        return listItemView;
    }
}

