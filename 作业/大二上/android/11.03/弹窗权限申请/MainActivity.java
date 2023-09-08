package com.example.myapp;

import java.io.File;


import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;


public class MainActivity extends AppCompatActivity {
    private MediaPlayer mp;
    private AudioManager mp1;
    private boolean isPause=false;
    private String musicPath;
    private TextView hint;
    private File file;

    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };
    public static void verifyStoragePermissions(Activity activity){
        int permission = ActivityCompat.checkSelfPermission(activity,Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (permission!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
        }
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        verifyStoragePermissions(this);
        setContentView(R.layout.activity_main);
        final Button button1=(Button) findViewById(R.id.button1);
        final Button button2=(Button) findViewById(R.id.button2);
        final Button button3=(Button) findViewById(R.id.button3);
        final AudioManager mp1=(AudioManager)MainActivity.this.getSystemService(Context.AUDIO_SERVICE);
        hint=(TextView) findViewById(R.id.hint);
        file = new File("/sdcard/audio.flac");
//        String[] strings={
//                MediaStore.Audio.Media.TITLE,
//                MediaStore.Audio.Media.ARTIST,
//                MediaStore.Audio.Media.DATA
//        };
        MainActivity.this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        SeekBar seekBar=(SeekBar)findViewById(R.id.seekBar1);
        seekBar.setMax(mp1.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
        int progress=mp1.getStreamVolume(AudioManager.STREAM_MUSIC);
        seekBar.setProgress(progress);
        final TextView controlor=(TextView)findViewById(R.id.volume);
        controlor.setText("Volume"+progress);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackTouch(SeekBar seekBar){}
            public void onStartTrackTouch(SeekBar seekBar){}
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                controlor.setText("volume"+progress);
                mp1.setStreamVolume(AudioManager.STREAM_MUSIC,progress,AudioManager.FLAG_PLAY_SOUND);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        if(file.exists()){
            mp=MediaPlayer.create(this,Uri.parse(file.getAbsolutePath()));
        }else {
            hint.setText("The music is not exist!");
            button1.setEnabled(false);
            return;
        }
//        Cursor cursor=this.getContentResolver().query(uri,strings,null,null,null);
//        cursor.moveToNext();
//        musicPath=cursor.getString(2);
//
        mp=new MediaPlayer();
        mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                play();

            }
        });
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
                Toast.makeText(MainActivity.this,"音频正在播放",Toast.LENGTH_SHORT).show();
                if(isPause){
                    button2.setText("Pause");
                    isPause=false;

                }
                button2.setEnabled(true);
                button3.setEnabled(true);
                button1.setEnabled(false);
            }
        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()&&!isPause){
                    mp.pause();
                    Toast.makeText(MainActivity.this,"音频已暂停",Toast.LENGTH_SHORT).show();
                    isPause=true;
                    button2.setText("Go On");
                    hint.setText("Pause the music");
                    button1.setEnabled(true);
                }else {
                    mp.start();
                    Toast.makeText(MainActivity.this,"音频正在继续",Toast.LENGTH_SHORT).show();
                    button2.setText("Pause");
                    hint.setText("Go on to the music");
                    isPause=false;
                    button1.setEnabled(false);
                }
            }
        });
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                Toast.makeText(MainActivity.this,"音频已停止",Toast.LENGTH_SHORT).show();
                hint.setText("Stop the music");
                button1.setEnabled(true);
                button2.setEnabled(false);
                button3.setEnabled(false);
            }
        });
    }
    private void play(){
        try {
            mp.reset();
            mp.setDataSource(file.getAbsolutePath());
            mp.prepare();
            mp.start();
            hint.setText("The music is playing");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    protected void onDestroy() {
        if(mp.isPlaying()){
            mp.stop();
        }
        mp.release();
        super.onDestroy();
    }
}
