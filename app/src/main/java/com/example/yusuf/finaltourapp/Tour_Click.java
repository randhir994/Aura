package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Tour_Click extends AppCompatActivity {
    ListView lv;
    public void location(View v){
        startActivity(new Intent(Tour_Click.this,location.class));
    }
    public void guest(View v){
        startActivity(new Intent(Tour_Click.this,guest.class));
    }
    public void date(View v){
        startActivity(new Intent(Tour_Click.this,date.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour__click);
        lv=(ListView)findViewById(R.id.listview);
        lv.setAdapter(new TourClickImageAdapter(this));
    }
}
