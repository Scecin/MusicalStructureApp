package com.example.musicalstructureapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Song> {


    public SongsAdapter(Activity context, ArrayList<Song> song) {
        super(context, 0, song);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull  ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong= getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songNameTextView = (TextView) convertView.findViewById(R.id.song_name_view);
        // Get the version name from the current Song object and
        // set this text on the song name TextView
        songNameTextView.setText(currentSong.getSongName());

        TextView artistNameTextView = (TextView) convertView.findViewById(R.id.artist_name_view);
        artistNameTextView.setText(currentSong.getArtistName());

        TextView timeSongTextView = (TextView) convertView.findViewById(R.id.time_view);
        timeSongTextView.setText(currentSong.getTimeSong());

        ImageView iconView = (ImageView) convertView.findViewById(R.id.image_view);
        iconView.setImageResource(currentSong.getImageResourceId());

        return convertView;
    }
}
