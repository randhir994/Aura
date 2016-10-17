package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_page extends AppCompatActivity {

public void backButton(View v){
    super.onBackPressed();
}

    public void createActivityClick(View view){

        Intent intent = new Intent(getApplicationContext(),activity_creation.class);
        startActivity(intent);

    }


    public void joiningActivityClick(View view){

        Intent intent = new Intent(getApplicationContext(),activity_join.class);
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_page);


        getSupportActionBar().hide();
    }
}
