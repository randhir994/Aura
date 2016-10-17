package com.example.yusuf.finaltourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersonPrivateTourView extends AppCompatActivity {
    public void backButton(View view){
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_person_info);
    }
}
