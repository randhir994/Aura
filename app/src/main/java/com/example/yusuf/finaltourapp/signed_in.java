package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class signed_in extends AppCompatActivity {


    public void seePreviousActivity(View v){
        startActivity(new Intent(signed_in.this,See_previous_Activity.class));
    }
    public void createTour(View v){
        startActivity(new Intent(signed_in.this,CreateTour.class));
    }


    public void createActivty(View v){
        startActivity(new Intent(signed_in.this,activity_page.class));
    }

    public void editProfile(View v){
        startActivity(new Intent(this,liveTour.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signed_in);
    }
}
