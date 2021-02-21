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
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.ViewHolder> {

    private List<Song> songs;

    public SongsAdapter(List<Song> songs) {
        this.songs = songs;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView songNameTextView;
        public TextView artistNameTextView;
        public TextView timeSongTextView;
        public ImageView iconView;

        public ViewHolder(View itemView) {
            super(itemView);
            songNameTextView = itemView.findViewById(R.id.song_name_view);
            artistNameTextView = itemView.findViewById(R.id.artist_name_view);
            timeSongTextView = itemView.findViewById(R.id.time_view);
            iconView = itemView.findViewById(R.id.image_view);
        }

        void bind(Song currentSong) {
            songNameTextView.setText(currentSong.getSongName());
            artistNameTextView.setText(currentSong.getArtistName());
            timeSongTextView.setText(currentSong.getTimeSong());
            iconView.setImageResource(currentSong.getImageResourceId());
        }
    }

    @NonNull
    @Override
    public SongsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SongsAdapter.ViewHolder holder, int position) {
        Song currentSong = songs.get(position);
        holder.bind(currentSong);
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }
}
