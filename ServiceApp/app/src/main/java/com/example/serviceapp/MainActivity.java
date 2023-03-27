package com.example.serviceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    CardView w,c,e,p,m,r,water,o;
    BottomNavigationView bottomNavigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        w=findViewById(R.id.cardwifi);
        c=findViewById(R.id.cardcarpenter);
        e=findViewById(R.id.cardelectrician);
        p=findViewById(R.id.cardplumber);
        m=findViewById(R.id.cardmess);
        r=findViewById(R.id.cardroomservice);
        water=findViewById(R.id.cardwater);
        o=findViewById(R.id.cardothers);
        bottomNavigationView=findViewById(R.id.bottom_nav);

        bottomNavigationView.setSelectedItemId(R.id.homepage);

        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsWifi.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsCarpenter.class);
                startActivity(intent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsElectrician.class);
                startActivity(intent);
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsPlumber.class);
                startActivity(intent);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ComplaintMess.class);
                startActivity(intent);
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ComplaintRoomService.class);
                startActivity(intent);
            }
        });
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ComplaintWater.class);
                startActivity(intent);
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ComplaintOthers.class);
                startActivity(intent);
            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            myClickItem(item);
            return true;
        });



    }
    public void myClickItem(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.homepage:
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;

            case R.id.lostfound:
                Intent intent2 = new Intent(MainActivity.this, LostFound.class);
                startActivity(intent2);
                overridePendingTransition(0,0);
                break;

            case R.id.profile:
                Intent intent3 = new Intent(MainActivity.this, Profile.class);
                startActivity(intent3);
                overridePendingTransition(0,0);
                break;

            case R.id.history:
                Intent intent4 = new Intent(MainActivity.this, History.class);
                startActivity(intent4);
                overridePendingTransition(0,0);
                break;

        }


    }

}