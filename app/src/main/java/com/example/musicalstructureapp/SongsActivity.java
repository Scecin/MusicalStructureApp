package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    ArrayList<Song> songs = new ArrayList<Song>();
    SongsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        adapter = new SongsAdapter(songs);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        setPlaces();

       //Find the view that shows the playList category
        Button playButton = (Button) findViewById(R.id.play_button_2);
        playButton.setOnClickListener(v -> {
            Intent playIntent = new Intent(SongsActivity.this, PlayList.class);
            startActivity(playIntent);
        });
    }

    private void setPlaces() {
        songs.add(new Song(getString(R.string._20th_century_fox_fanfare), getString(R.string.queen),getString(R.string._0_25), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.somebody_to_love), getString(R.string.queen), getString(R.string._4_55), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.doing_all_right), getString(R.string.smile), getString(R.string._3_16), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.keep_yourself_alive), getString(R.string.queen), getString(R.string._3_56), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.killer_queen), getString(R.string.queen), getString(R.string._2_59), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.fat_bottomed_girls), getString(R.string.queen), getString(R.string._4_37), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.bohemian_rhapsody), getString(R.string.queen), getString(R.string._5_54), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.now_im_here), getString(R.string.queen), getString(R.string._4_26), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.crazy_little_thing_called_love), getString(R.string.queen), getString(R.string._2_43), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.love_of_my_life), getString(R.string.queen), getString(R.string._4_28), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.we_will_rock_you), getString(R.string.queen), getString(R.string._2_09), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.another_one_bites_the_dust), getString(R.string.queen), getString(R.string._3_34), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.i_want_to_break_free), getString(R.string.queen), getString(R.string._3_43), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.under_pressure), getString(R.string.queen), getString(R.string._4_04), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.who_wants_to_live_forever), getString(R.string.queen), getString(R.string._5_14), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.radio_ga_ga), getString(R.string.queen), getString(R.string._4_05), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.ay_Oh), getString(R.string.queen), getString(R.string._0_41), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.hammer_to_fall), getString(R.string.queen), getString(R.string._4_03), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.we_are_the_champions), getString(R.string.queen), getString(R.string._3_57), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.dont_stop_me_now), getString(R.string.queen), getString(R.string._3_37), R.drawable.bohemian_rhapsody));
        songs.add(new Song(getString(R.string.the_show_must_go_on), getString(R.string.queen), getString(R.string._4_31), R.drawable.bohemian_rhapsody));
    }
}