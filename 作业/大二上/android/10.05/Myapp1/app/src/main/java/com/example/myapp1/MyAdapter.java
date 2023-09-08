package com.example.myapp1;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public abstract class MyAdapter<T>extends BaseAdapter{
    private ArrayList<T>mData;
    private int mLayoutRes;
    public MyAdapter(){}
    public MyAdapter(ArrayList<T>mData,int mLayoutRes){
        this.mData=mData;
        this.mLayoutRes=mLayoutRes;
    }
    public int getCount(){
        return mData!=null?mData.size():0;
    }
    public T getItem(int position){
        return mData.get(position);
    }
    public long getItemId(int position){
        return position;
    }
    public View getView(int position, View converView, ViewGroup parent){
        ViewHolder holder=ViewHolder.bind(parent.getContext(),converView,parent,mLayoutRes,position);
        bindView(holder,getItem(position));
        return holder.getItemView();
    }
    public abstract void bindView(ViewHolder holder,T obj);
    public void add(T date){
        if (mData==null){
            mData=new ArrayList<>();
        }
        mData.add(date);
        notifyDataSetChanged();
    }
    public void add(int position,T data){
        if (mData==null){
            mData=new ArrayList<>();
        }
        mData.add(position,data);
        notifyDataSetChanged();
    }
    public void remove(T data){
        if (mData!=null){
            mData.remove(data);
        }
        notifyDataSetChanged();
    }
    public void remove(int position){
        if (mData!=null){
            mData.remove(position);
        }
        notifyDataSetChanged();
    }
    public void clear(){
        if (mData!=null){
            mData.clear();
        }
        notifyDataSetChanged();
    }
    public static class ViewHolder{
        private SparseArray<View>mViews;
        private View item;
        private int position;
        private Context context;

        private  ViewHolder(Context context,ViewGroup parent,int layoutRes){
            mViews=new SparseArray<>();
            this.context=context;
            View convertView = LayoutInflater.from(context).inflate(layoutRes,parent,false);
            convertView.setTag(this);
            item=convertView;
        }
        public static ViewHolder bind(Context context,View converView,ViewGroup parent,int layoutRes,int position){
            ViewHolder holder;
            if (converView==null){
                holder = new ViewHolder(context,parent,layoutRes);
            }else{
                holder=(ViewHolder)converView.getTag();
                holder.item=converView;
            }
            holder.position=position;
            return holder;
        }
        //        @SuppressWarnings("unchecked")
        public <T extends View>T getView(int id){
            T t=(T)mViews.get(id);
            if (t==null){
                t=(T)item.findViewById(id);
                mViews.put(id,t);
            }
            return t;
        }
        public View getItemView(){
            return item;
        }
        public int getItemPosition(){
            return position;
        }
        public ViewHolder setText(int id,CharSequence text){
            View view =getView(id);
            if (view instanceof TextView){
                ((TextView)view).setText(text);
            }
            return this;
        }
        public ViewHolder setImageResource(int id,int drawbleRes){
            View view=getView(id);
            if(view instanceof ImageView){
                ((ImageView) view).setImageResource(drawbleRes);
            }else {
                view.setBackgroundResource(drawbleRes);
            }
            return this;
        }
        public ViewHolder setOnClickListener(int id, View.OnClickListener listener){
            getView(id).setOnClickListener(listener);
            return this;
        }
        public ViewHolder setVisibility(int id,int visible){
            getView(id).setVisibility(visible);
            return this;
        }
        public ViewHolder setTag(int id,Object obj){
            getView(id).setTag(obj);
            return this;
        }
    }
}
