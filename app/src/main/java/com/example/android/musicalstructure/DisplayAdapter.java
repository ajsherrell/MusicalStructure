package com.example.android.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayAdapter extends ArrayAdapter<Display> {

    // create constructor (matches class name)
    public DisplayAdapter(Activity context, ArrayList<Display> displays) {
        super(context, 0, displays);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get the {@link Display} object located at this position in the list
        Display currentDisplay = getItem(position);

        // set artist text view
        TextView artistTextView  = (TextView) listItemView.findViewById(R.id.artistTextView);
        artistTextView.setText(currentDisplay.getArtist());

        // set song text view
        TextView songsTextView = (TextView) listItemView.findViewById(R.id.songsTextView);
        songsTextView.setText(currentDisplay.getSong());

        return listItemView;
    }
}
