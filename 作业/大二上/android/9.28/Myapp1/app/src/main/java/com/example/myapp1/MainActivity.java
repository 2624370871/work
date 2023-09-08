package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {
private int[] imageId=new int[] {R.drawable.img1,R.drawable.img2,
        R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,
        R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10,
        R.drawable.img11,R.drawable.img12};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        GridView gridView=(GridView)findViewById(R.id.gridView1);
        String[]title=new String[]{"wz","ymc","wjj","zx","kbw","pj","ck","zcj","dsq","cj","jxh","lws"};
        List<Map<String,Object>>listItems=new ArrayList<Map<String, Object>>();
        for (int i=0;i<imageId.length;i++){
            Map<String,Object>map=new HashMap<String, Object>();
            map.put("image",imageId[i]);
            map.put("title",title[i]);
            listItems.add(map);
        }
        SimpleAdapter adapter=new SimpleAdapter(
                this,listItems,R.layout.item,new String[]{"title","image"},new int[]{R.id.title,R.id.image}
        );
    }
}