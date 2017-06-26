package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find View that shows Recent Activity category
         TextView RecentActivity = (TextView) findViewById(R.id.RecentActivity);

        //Set click listener to RecentActivity view
        RecentActivity.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when RecentActivity View is clicked on.
            @Override
            public void onClick(View v){
                Intent RecentActivityIntent = new Intent(MainActivity.this, RecentActivity.class);
                startActivity(RecentActivityIntent);
            }
        });

        //Find View that shows Top Chart category
        TextView TopChartActivity = (TextView) findViewById(R.id.TopChart);

        //Set click listener to TopChartActivity view
        TopChartActivity.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when TopChartActivity View is clicked on.
            @Override
            public void onClick(View v){
                Intent TopChartIntent = new Intent(MainActivity.this, TopChartsActivity.class);
                startActivity(TopChartIntent);
            }
        });

        //Find View that shows Recommended category
         TextView Recommended = (TextView) findViewById(R.id.Recommended);

        //Set click listener to Recommended view
        Recommended.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when RecommendedActivity View is clicked on.
            @Override
            public void onClick(View v){
                Intent RecommendedIntent = new Intent(MainActivity.this, RecommendedActivity.class);
                startActivity(RecommendedIntent);
            }
        });

        //Find View that shows Feeling Lucky view
        final TextView FeelingLucky = (TextView) findViewById(R.id.FeelingLucky);

        //Set click listener to Feeling Lucky view
        FeelingLucky.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when FeelingLuckyActivity View is clicked on.
            @Override
            public void onClick(View v) {
                Intent FeelingLuckIntent = new Intent(MainActivity.this, FeelingLuckyActivity.class);
                startActivity(FeelingLuckIntent);
            }
        });

        //Find View that shows My Music category
        TextView MyMusic = (TextView) findViewById(R.id.MyMusic);

        MyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MyMusicIntent = new Intent(MainActivity.this, MyMusicActivity.class);
                startActivity(MyMusicIntent);
            }
        });
    }
}
