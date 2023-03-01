package com.example.myapp;

import java.io.IOException;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
private MediaPlayer mplayer;
private SurfaceView sview;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mplayer=new MediaPlayer();
        sview=(SurfaceView) findViewById(R.id.surfaceView1);
        Button play=(Button) findViewById(R.id.play);
        final Button pause=(Button) findViewById(R.id.pause);
        Button stop=(Button) findViewById(R.id.stop);
        play.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mplayer.reset();
                try {
                    mplayer.setDataSource("/sdcard/radish.mp4");
                    mplayer.setDisplay(sview.getHolder());
                    mplayer.prepare();
                    mplayer.start();
                    pause.setText("Pause");
                    pause.setEnabled(true);
                }catch (IllegalArgumentException e){
                    e.printStackTrace();
                }catch (SecurityException e){
                    e.printStackTrace();
                }catch (IllegalStateException e){
                    e.printStackTrace();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
        stop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mplayer.isPlaying()){
                    mplayer.stop();
                    pause.setEnabled(false);
                }
            }
        });
        pause.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mplayer.isPlaying()){
                    mplayer.pause();
                    ((Button)v).setText("Go On");
                }else {
                    mplayer.start();
                    ((Button)v).setText("Pause");
                }
            }
        });
        mplayer.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(MainActivity.this,"The Video is Over",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        if(mplayer.isPlaying()){
            mplayer.stop();
        }
            mplayer.release();
            super.onDestroy();

    }
}
