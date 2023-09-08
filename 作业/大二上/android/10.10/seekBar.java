package com.example.myapp;
import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
public class seekBar extends Activity {
    private SeekBar seekBar;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        final TextView result=(TextView)findViewById(R.id.textview1);
        seekBar =(SeekBar)findViewById(R.id.seekBar1);
        seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar){
                Toast.makeText(seekBar.this,"结束滑动",Toast.LENGTH_SHORT).show();
            }
            public void onStartTrackingTouch(SeekBar seekBar){
                Toast.makeText(seekBar.this,"开始滑动",Toast.LENGTH_SHORT).show();
            }
            public void onProgressChanged(SeekBar seekBar,int progress,boolean fromUser){
                result.setText("当前值:"+progress);
            }
        });
    }
}

