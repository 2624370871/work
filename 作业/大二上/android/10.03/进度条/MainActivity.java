package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ProgressBar horizonP;
    private ProgressBar circleP;
    private int mProgressStatus=0;
    private Handler mHandler;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        horizonP=(ProgressBar)findViewById(R.id.progressBar1);
        circleP=(ProgressBar)findViewById(R.id.progressBar2);
        circleP.incrementProgressBy(-10);
        circleP.setVisibility(View.VISIBLE);
        mHandler=new Handler(){
            public void handleMessage(Message msg){
                if (msg.what==0x111){
                    horizonP.setProgress(mProgressStatus);
                    circleP.setProgress(100-mProgressStatus);
                }else {
                    Toast.makeText(MainActivity.this, "操作已经完成", Toast.LENGTH_SHORT).show();
                    horizonP.setVisibility(View.GONE);
                    circleP.setVisibility(View.GONE);}
            }
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    mProgressStatus=doWork();
                    Message m=new Message();
                    if (mProgressStatus<100){
                        m.what=0x111;
                        mHandler.sendMessage(m);
                    }else{
                        m.what=0x110;
                        mHandler.sendMessage(m);
                        break;
                    }
                }
            }
            private int doWork(){
                mProgressStatus+=Math.random()*10;
                try {
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                return mProgressStatus;
            }
        }).start();
    }
}
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
