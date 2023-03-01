package com.example.myapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.myapp.R.*;

public class MainActivity extends Activity {
    private Thread thread;
    private static MediaPlayer mp=null;

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(layout.activity_main);
        Button button =(Button) findViewById(id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Button)view).setEnabled(false);
                thread=new Thread(new Runnable() {
                    @Override
                    public void run() {
                        playBGSound();
                    }
                });
                thread.start();
            }
        });
    }
    private void playBGSound(){
        if (mp!=null){
            mp.release();
        }
        mp=MediaPlayer.create(MainActivity.this,R.raw.hyl);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                try{
                    Thread.sleep(5000);
                    playBGSound();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
    }
    protected void onDestroy(){
        if (mp!=null){
            mp.stop();
            mp.release();
            mp=null;
        }
        if (thread!=null){
            thread=null;
        }
        super.onDestroy();
    }
}
