package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class RecommendedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended);

        //Find View that shows MusicPlaying Activity after song is chosen.
        TextView SongOption1 = (TextView) findViewById(R.id.MusicOption1);

        //Set click listener to RecentActivity view
        SongOption1.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when RecentActivity View is clicked on.
            @Override
            public void onClick(View v){
                Intent RecentActivityIntent = new Intent(RecommendedActivity.this, MusicPlayingActivity.class);
                startActivity(RecentActivityIntent);
            }
        });

        //Find View that Shows MusicPlaying Activity after song is chosen.
        TextView SongOption2 = (TextView) findViewById(R.id.MusicOption2);

        SongOption2.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when RecentActivity View is clicked on.
            @Override
            public void onClick(View v){
                Intent RecentActivityIntent = new Intent(RecommendedActivity.this, MusicPlayingActivity.class);
                startActivity(RecentActivityIntent);
            }
        });
    }
}
