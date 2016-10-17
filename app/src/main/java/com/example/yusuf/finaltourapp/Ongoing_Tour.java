package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Ongoing_Tour extends AppCompatActivity {
    public void backButton(View v){
        super.onBackPressed();
    }
public void info(View v){
    startActivity(new Intent(Ongoing_Tour.this,PersonPrivateTourView.class));
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outgoing_tour);
    }
}
