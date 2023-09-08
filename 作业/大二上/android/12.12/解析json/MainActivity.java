package com.example.myapp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import static com.example.myapp.R.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txt1,txt2;
    TextView txt3;
    Button jsonBtn,arrayBtn;
    JSONObject p1,p2,p3;
    JSONArray weather;
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(layout.activity_main);
       txt1=(EditText)findViewById(id.editText);
        txt2=(EditText)findViewById(id.editText2);
        txt3=(TextView) findViewById(id.txt3);
        jsonBtn=(Button) findViewById(id.button);
        jsonBtn.setOnClickListener(this);
        arrayBtn=(Button)findViewById(id.button2);
        arrayBtn.setOnClickListener(this);
        try {
            p1=new JSONObject("{\"城市\":\"大理\",\"气温\":\"0-14度，多云\"}");
            p2=new JSONObject("{\"城市\":\"武汉\",\"气温\":\"0-10度，小雨\"}");
            p3=new JSONObject("{\"城市\":\"十堰\",\"气温\":\"0-11度，雨雪\"}");
            weather=new JSONArray();
            weather.put(p1);
            weather.put(p2);
            weather.put(p3);
        }catch (JSONException e){
            e.printStackTrace();

        }
    }
    void setJsonData(){
        try {
            JSONObject test=new JSONObject();
            test.put("城市","深圳");
            test.put("气温",30);
            String jc=test.getString("城市");
            txt1.setText(jc);
            int jw=test.getInt("气温");
            txt2.setText(Integer.toString(jw));
        }catch (JSONException e){

        }
    }
    void setandgetArrayData(){
        try {
            String jc,jw;
            int length=weather.length();
            for (int i=0;i<length;i++){
                JSONObject jsonObject=weather.getJSONObject(i);
                jc=jsonObject.getString("城市")+":";
                jw=jsonObject.getString("气温")+"\n";
                txt3.append(jc+jw);
            }
        }catch (JSONException e){

        }
    }

    @Override
    public void onClick(View v) {
        if(v==jsonBtn){
            setJsonData();
        }else if(v==arrayBtn){
            setandgetArrayData();
        }
    }
}