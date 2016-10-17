package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout tour;
    public void activityClick(View view){

        Intent intent = new Intent(getApplicationContext(),activity_page.class);
        startActivity(intent);

    }


    public void collegeEventClick(View view){

        Intent intent = new Intent(getApplicationContext(),college_event.class);
        startActivity(intent);

    }



    public void createEventClick(View view){

        Intent intent = new Intent(getApplicationContext(),create_event.class);
        startActivity(intent);

    }


    public void CreateCorporateEvents(View v){
        startActivity(new Intent(MainActivity.this,CreateCorporate.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tour=(LinearLayout)findViewById(R.id.tours);
        tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,tourlogin.class));
            }
        });
    }
}
