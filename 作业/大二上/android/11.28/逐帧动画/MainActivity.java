package com.example.myapp;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity{
    private boolean flag = true;
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout ll = (LinearLayout) findViewById(R.id.ll);
        final AnimationDrawable drawable = (AnimationDrawable) ll.getBackground();
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag){
                    drawable.start();
                    flag=true;
                }else{
                    drawable.stop();
                    flag=true;
                }
            }
        });
    }
}
