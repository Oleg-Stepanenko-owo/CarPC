package com.catfishkin.carpc.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.catfishkin.carpc.R;

public class CD_DVD_Activity extends AppCompatActivity {

    boolean play = true;
    TextView track;
    TextView albom;
    TextView disk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cd__dvd);
        track = (TextView) findViewById(R.id.track);
        albom = (TextView) findViewById(R.id.albom);
        disk = (TextView) findViewById(R.id.disk);
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
            case R.id.play_list: {
                Intent intent = new Intent(this, FolderActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.back: {
                finish();
                break;
            }
        }
    }

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

    void setTrack(String str){
        track.setText(str);
    }

    void setAlbom(String str){
        albom.setText(str);
    }

    void setDisk(String str){
        disk.setText(str);
    }

    String getTrack() {
        return track.getText().toString();
    }

    String getAlbom() {
        return albom.getText().toString();
    }

    String getDisk() {
        return disk.getText().toString();
    }
}
