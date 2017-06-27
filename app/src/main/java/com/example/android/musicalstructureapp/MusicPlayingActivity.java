package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MusicPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_playing);

        TextView Purhcase = (TextView) findViewById(R.id.Purchase);

        Purhcase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PaymentIntent = new Intent(MusicPlayingActivity.this, Payment_Activity.class);
                startActivity(PaymentIntent);
            }
        });
    }
}
