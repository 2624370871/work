package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout fl=(FrameLayout)findViewById(R.id.frameLayout1);
        fl.addView(new Myiamge(this));
    }
    public class Myiamge extends View {
        public Myiamge(Context context){
            super(context);
        }
        protected void onDraw(Canvas canvas){
            Paint paint=new Paint();
            paint.setAntiAlias(true);
            Bitmap bm_pic= BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.pic);
            canvas.drawBitmap(bm_pic,0,0,paint);
            Matrix m1=new Matrix();
            m1.setScale(2f,2f);
            canvas.drawBitmap(bm_pic,m1,paint);

            Matrix m2=new Matrix();
            m2.setScale(0.75f,0.75f);
            canvas.drawBitmap(bm_pic,m2,paint);

            Matrix m3=new Matrix();
            m3.setScale(0.25f,0.25f);
            canvas.drawBitmap(bm_pic,m3,paint);
            super.onDraw(canvas);
        }
    }
}

