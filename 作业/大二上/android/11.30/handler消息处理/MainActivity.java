package com.example.myapp;
import android.os.Bundle;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.myapp.R.*;

public class MainActivity extends AppCompatActivity{


    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(layout.activity_main);
        LooperThread thread=new LooperThread();
        thread.start();
    }
}