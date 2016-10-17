package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class thank_you extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        getSupportActionBar().hide();

        ImageView activityThankImage5= (ImageView) findViewById(R.id.activityThankImage5);


        activityThankImage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),activity_page.class);
                startActivity(intent);

            }
        });
    }
}
