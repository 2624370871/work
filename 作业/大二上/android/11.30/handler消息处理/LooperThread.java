package com.example.myapp;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

import android.os.Handler;

public class LooperThread extends Thread{
    public Handler handler1;

    @Override
    public void run() {
        super.run();
        Looper.prepare();
        handler1=new Handler(){
          public void handleMessage(Message msg){
              Log.i("Looper",String.valueOf(msg.what));
          }
        };
        Message m=handler1.obtainMessage();
        m.what=0x11;
        handler1.sendMessage(m);
        Looper.loop();
    }
}
