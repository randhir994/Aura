package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Randhir Kumar on 17-08-2016.
 */

public class sign_in_two  extends AppCompatActivity {

    public void liveTour(View v){
        startActivity(new Intent(this,liveTour.class));
    }

    public void seePreviousActivity(View v){
        startActivity(new Intent(this,See_previous_Activity.class));
    }

    public void editProfile(View v){
        startActivity(new Intent(this,editProfile.class));
    }

    public void liveActivity(View v){
        startActivity(new Intent(this,liveActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sign_in_two);
    }
}