package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class college_event extends AppCompatActivity {

    public void backButton(View view){
        super.onBackPressed();
    }
    public void selectCollege(View view){

        Intent intent = new Intent(getApplicationContext(),select_college.class);
        startActivity(intent);
        intent.putExtra("remove filter","collegeEventFilterAvailaImage4");

        intent.putExtra("college bar","collegeEventFilterAvailaImage5");
    }


    public void imageClickPage(View view){

        Intent intent = new Intent(getApplicationContext(),image_page.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_event);
        getSupportActionBar().hide();


    }
}
