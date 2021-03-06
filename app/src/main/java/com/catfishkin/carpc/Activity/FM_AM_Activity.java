package com.catfishkin.carpc.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.catfishkin.carpc.R;

public class FM_AM_Activity extends AppCompatActivity {

    boolean play = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fm__am);
        longClick();
    }

    void longClick() {
        findViewById(R.id.fm1_1).setOnLongClickListener(longClick);
        findViewById(R.id.fm1_2).setOnLongClickListener(longClick);
        findViewById(R.id.fm1_3).setOnLongClickListener(longClick);
        findViewById(R.id.fm1_4).setOnLongClickListener(longClick);
        findViewById(R.id.fm1_5).setOnLongClickListener(longClick);
        findViewById(R.id.fm1_6).setOnLongClickListener(longClick);

        findViewById(R.id.fm2_1).setOnLongClickListener(longClick);
        findViewById(R.id.fm2_2).setOnLongClickListener(longClick);
        findViewById(R.id.fm2_3).setOnLongClickListener(longClick);
        findViewById(R.id.fm2_4).setOnLongClickListener(longClick);
        findViewById(R.id.fm2_5).setOnLongClickListener(longClick);
        findViewById(R.id.fm2_6).setOnLongClickListener(longClick);

        findViewById(R.id.am1).setOnLongClickListener(longClick);
        findViewById(R.id.am2).setOnLongClickListener(longClick);
        findViewById(R.id.am3).setOnLongClickListener(longClick);
        findViewById(R.id.am4).setOnLongClickListener(longClick);
        findViewById(R.id.am5).setOnLongClickListener(longClick);
        findViewById(R.id.am6).setOnLongClickListener(longClick);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.prev: {
                Prev();
                break;
            }
            case R.id.play_pause: {
                if (play) {
                    ((ImageView) findViewById(R.id.play_pause)).setImageResource(R.drawable.pause);
                    Play();
                } else {
                    ((ImageView) findViewById(R.id.play_pause)).setImageResource(R.drawable.play);
                    Pause();
                }
                play = !play;
                break;
            }
            case R.id.next: {
                Next();
                break;
            }
            case R.id.back: {
                finish();
                break;
            }
        }
    }

    public void onClickRadio(View v) {
        switch (v.getTag().toString()) {
            case "fm1": {
                Fm1(v);
                break;
            }
            case "fm2": {
                Fm2(v);
                break;
            }
            case "am": {
                Am(v);
                break;
            }
        }
    }

    View.OnLongClickListener longClick = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            Toast.makeText(getApplicationContext(), "long click", Toast.LENGTH_SHORT).show();
            return true;
        }
    };

    void Prev() {
        Toast.makeText(this, "Подключите api", Toast.LENGTH_SHORT).show();
    }

    void Play() {
        Toast.makeText(this, "Подключите api", Toast.LENGTH_SHORT).show();
    }

    void Pause() {
        Toast.makeText(this, "Подключите api", Toast.LENGTH_SHORT).show();
    }

    void Next() {
        Toast.makeText(this, "Подключите api", Toast.LENGTH_SHORT).show();
    }

    void Fm1(View v){
        Toast.makeText(this, "Подключите api", Toast.LENGTH_SHORT).show();
    }

    void Fm2(View v){
        Toast.makeText(this, "Подключите api", Toast.LENGTH_SHORT).show();
    }

    void Am(View v){
        Toast.makeText(this, "Подключите api", Toast.LENGTH_SHORT).show();
    }
}
