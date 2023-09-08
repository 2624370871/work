package com.example.myapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.myapp.R.*;

public class MainActivity extends AppCompatActivity implements Runnable{
    private Thread thread;
    int i;

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(layout.activity_main);
        Button startbutton =(Button) findViewById(id.button);
        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=0;
                thread=new Thread(MainActivity.this);
                thread.start();
            }
        });

        Button stopButoon=(Button)findViewById(id.button2);
        stopButoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(thread!=null){
                    thread.interrupt();
                    thread=null;
                }
                Log.i("Tips:","Stop the thread");
            }
        });
    }
    protected void onDestroy(){
        if (thread!=null){
            thread.interrupt();
            thread=null;
        }
        super.onDestroy();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            i++;
            Log.i("启动线程标识：",String.valueOf(i));
        }
    }
}