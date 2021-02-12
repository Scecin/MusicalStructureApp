package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows the queen category
        ImageView queenImage = (ImageView) findViewById(R.id.queen_image);
        queenImage.setOnClickListener((View v) -> {
            Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
            startActivity(songsIntent);
        });

        //Find the view that shows the playList category
        Button playButton = (Button) findViewById(R.id.play_button_1);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(MainActivity.this, SongsActivity.class);
                MainActivity.this.startActivity(playIntent);
            }
        });
    }

}