package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class select_college extends AppCompatActivity {

    String filter,college;

    public void backButton(View view){
        super.onBackPressed();
    }

    public void filterClick(View view){

        Intent intent = new Intent(getApplicationContext(),college_event.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_college);

        getSupportActionBar().hide();

       Intent intent = getIntent();
        filter = intent.getStringExtra("collegeEventFilterAvailaImage4");

        college = intent.getStringExtra("collegeEventFilterAvailaImage5");
    }
}
