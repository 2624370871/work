package com.example.myapp;

import java.io.File;
import java.lang.reflect.Field;


import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Environment;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private VideoView tv;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(VideoView) findViewById(R.id.video);
        File file=new File("/sdcard/radish.mp4");
        MediaController mc=new MediaController(MainActivity.this);
        if(file.exists()){
            tv.setVideoPath(file.getAbsolutePath());
            tv.setMediaController(mc);
            tv.requestFocus();
            try{
                tv.start();
            }catch (Exception e){
                e.printStackTrace();
            }
            tv.setOnCompletionListener(new OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    Toast.makeText(MainActivity.this,"this video is over",Toast.LENGTH_SHORT).show();
                }
            });
        }else {
            Toast.makeText(MainActivity.this,"this video is not exist",Toast.LENGTH_SHORT).show();
        }
    }
}
