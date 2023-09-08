package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=(RatingBar) findViewById(R.id.ratingBar1);
        Button button=(Button) findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int result=ratingBar.getProgress();
                float rating=ratingBar.getRating();
                float step=ratingBar.getStepSize();
                Log.i("星级评价条","step="+step+"result="+result+"rating="+rating);
                Toast.makeText(MainActivity.this,"斩获"+rating+"颗星",Toast.LENGTH_LONG).show();
            }
        });
    }

}
