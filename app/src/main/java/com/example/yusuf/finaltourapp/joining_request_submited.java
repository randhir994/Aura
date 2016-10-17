package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class joining_request_submited extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joining_request_submited);

        getSupportActionBar().hide();


        ImageView activityJoinRequestImage5= (ImageView) findViewById(R.id.activityJoinRequestImage5);


        activityJoinRequestImage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),activity_page.class);
                startActivity(intent);

            }
        });
    }
}
