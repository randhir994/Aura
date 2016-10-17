package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class tourlogin extends AppCompatActivity {

    public void join(View v){
        startActivity(new Intent(tourlogin.this,MainActivity.class));
    }

public void go(View v){
    startActivity(new Intent(tourlogin.this,sign_in_two.class));
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourlogin);
    }
}
