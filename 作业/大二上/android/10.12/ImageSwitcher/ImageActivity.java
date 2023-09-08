package com.example.myapp;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher.ViewFactory;
import android.widget.Toast;
public class ImageActivity extends Activity{
private int[] imageId=new int[] {R.drawable.img1,R.drawable.img2,
        R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,
        R.drawable.img7,R.drawable.img8,R.drawable.img9};
private int index=0;
private ImageSwitcher imageSwitcher;
@Override
    public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_imageswitcher);
    imageSwitcher=(ImageSwitcher)findViewById(R.id.imageSwitcher1);
    imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,android.R.anim.fade_in));
    imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,android.R.anim.fade_out));
    imageSwitcher.setFactory(new ViewFactory() {
        @Override
        public View makeView() {
            ImageView imageView=new ImageView(ImageActivity.this);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
            return imageView;
        }
    });
    imageSwitcher.setImageResource(imageId[index]);
    Button up=(Button)findViewById(R.id.button1);
    Button down=(Button)findViewById(R.id.button2);
    up.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            if(index>0){
                index--;
            }else {
                index=imageId.length-1;
            }
            imageSwitcher.setImageResource(imageId[index]);
            Toast.makeText(ImageActivity.this,"这是第"+(index+1)+"张图片",Toast.LENGTH_LONG).show();
        }
    });
    down.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            if(index<imageId.length-1){
                index++;
            }else {
                index=0;
            }
            imageSwitcher.setImageResource(imageId[index]);
            Toast.makeText(ImageActivity.this,"这是第"+(index+1)+"张图片",Toast.LENGTH_LONG).show();
        }
    });
}
}
