package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class tour_joining extends AppCompatActivity {

    public void tourClick(View v){
        startActivity(new Intent(tour_joining.this,MainFolder.class));
    }

String arr[]={"PAN CARD","VOTER ID CARD","ADHAAR CARD","DRIVING LICENCE","PASSPORT"};
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_joining);
        sp=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter ar=new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arr);
        sp.setAdapter(ar);
    }
}
