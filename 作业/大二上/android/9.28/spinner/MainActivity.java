package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        final Spinner spinner=findViewById(R.id.spinner);
       spinner.setOnItemSelectedListener(new OnItemSelectedListener(){
           @Override
           public void onItemSelected(AdapterView<?> parent, View arg1, int position, long id) {
               String result=parent.getItemAtPosition(position).toString();
               Log.i("示例：",result);
           }

           @Override
           public void onNothingSelected(AdapterView<?> arg0) {
           }
       });

        Button Btn=(Button) findViewById(R.id.Btn);
        Btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你选择的类型是："+spinner.getSelectedItem().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
