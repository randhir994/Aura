package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainFolder extends AppCompatActivity {
    public void backButton(View v){
        super.onBackPressed();
    }
public void tourClick(View v){
    startActivity(new Intent(MainFolder.this,Tour_Click.class));
}
    public void ongoingTour(View v){
        startActivity(new Intent(MainFolder.this,Ongoing_Tour.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_folder);
    }
}
