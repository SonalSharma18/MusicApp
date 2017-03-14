package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Genres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);
        TextView Pop = (TextView) findViewById(R.id.pop);
        final Intent in1 = new Intent(this,Pop.class);
        TextView Jazz = (TextView)findViewById(R.id.jazz);
        final Intent in2 = new Intent(this, Jazz.class);

        Pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(in1);
            }
        });
        Jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(in2);
            }
        });
    }
}








