package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * */
public class startPage  extends AppCompatActivity{

    public void join(View v){
        startActivity(new Intent(this,MainActivity.class));
    }

    public void go(View v){
        startActivity(new Intent(this,sign_in_two.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tourlogin);
    }
}
