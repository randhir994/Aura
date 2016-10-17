package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

public class CreateCorporate3 extends AppCompatActivity {
    public void backButton(View v){
        super.onBackPressed();
    }
ListView lv;
public void location(View v){
    startActivity(new Intent(CreateCorporate3.this,location.class));
}
    public void guest(View v){
        startActivity(new Intent(CreateCorporate3.this,guest.class));
    }
    public void date(View v){
        startActivity(new Intent(CreateCorporate3.this,date.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_corporate3);
        lv=(ListView)findViewById(R.id.listview);
        lv.setAdapter(new ImageListAdapter(this));

    }
}
