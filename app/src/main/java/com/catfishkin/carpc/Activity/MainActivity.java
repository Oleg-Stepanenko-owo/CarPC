package com.catfishkin.carpc.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.catfishkin.carpc.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cd_dvd:{
                Intent intent = new Intent(this, CD_DVD_Activity.class);
                startActivity(intent);
                break;
            }
            case R.id.fm_am:{
                Intent intent = new Intent(this, FM_AM_Activity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
