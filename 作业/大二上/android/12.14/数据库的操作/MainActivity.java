package com.example.myapp;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import java.sql.SQLData;

import static com.example.myapp.R.*;

public class MainActivity extends AppCompatActivity {
    Button createBtn,deleteDB,queryBtn,deleteItemBtn,insertBtn;
    TextView txt;
    DatabaseHelper mOpenHelper;
MySQLDatabase myc;
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(layout.activity_main);
        createBtn=(Button)findViewById(id.createdb);
        createBtn.setOnClickListener(new mClick());
        deleteDB=(Button)findViewById(id.deletedb);
        deleteDB.setOnClickListener(new mClick());

        insertBtn=(Button)findViewById(id.insertBtn);
        insertBtn.setOnClickListener(new mClick());

        deleteItemBtn=(Button)findViewById(id.deleteItemBtn);
        deleteItemBtn.setOnClickListener(new mClick());

        queryBtn=(Button)findViewById(id.queryBtn);
        queryBtn.setOnClickListener(new mClick());

        txt=(TextView)findViewById(R.id.txt);
        mOpenHelper=new DatabaseHelper(MainActivity.this);
    }
    public class mClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if(v==createBtn){
                myc =new MySQLDatabase();
                myc.onCreate();
                Toast.makeText(MainActivity.this,"数据库和数据表创建成功",Toast.LENGTH_SHORT).show();
            }else if(v==deleteDB){
                deleteDatabase(Database_name);
                Toast.makeText(MainActivity.this,"数据库删除成功",Toast.LENGTH_SHORT).show();
            }
            else if(v==queryBtn){
                myc.showItems();
                Log.i("sql=","插入两条数据");
                Toast.makeText(MainActivity.this,"数据查询成功",Toast.LENGTH_SHORT).show();
            }
            else if(v==insertBtn){
                myc.insertItem();
                Toast.makeText(MainActivity.this,"数据插入成功",Toast.LENGTH_SHORT).show();
            }
            else if(v==deleteItemBtn){
                myc.deleteItem();
                Toast.makeText(MainActivity.this,"删除数据成功",Toast.LENGTH_SHORT).show();
            }
        }
    }
    static final String Database_name="eBook.db";
    static final int Database_Version=1;
    static final String TABLE_NAME="diary";
    static final String ID="nid";
    static final String TITLE="title";
    static final String BODY="body";
    private static class DatabaseHelper extends SQLiteOpenHelper {
DatabaseHelper(Context context){
    super(context,Database_name,null,Database_Version);
}

        @Override
        public void onCreate(SQLiteDatabase db) { }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {   }
    }

    class MySQLDatabase {
        SQLiteDatabase db;
        public void onCreate(){
    String DATABASE_CREATE="CREATE TABLE IF NOT EXISTS "+TABLE_NAME+"("
            +ID+" INTEGER primary key autoincrement, "
            +TITLE+" text not null, "
            +BODY+" text not null); ";
    int mode= Context.MODE_PRIVATE;
    try {
        db=openOrCreateDatabase(Database_name,mode,null);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        db.execSQL(DATABASE_CREATE);
        txt.setText("数据库重建成功");
    }catch (SQLException e){
        txt.setText("数据库重建错误");
    }
}
        private void insertItem(){
            try {
                ContentValues values=new ContentValues();
                values.put(TITLE,"Android");
                values.put(BODY,"发展真是迅速啊");
                db.insert(TABLE_NAME,ID,values);

                values.put(TITLE,"城市");
                values.put(BODY,"发展真是迅速啊");
                db.insert(TABLE_NAME,ID,values);

                txt.setText("插入两条数据成功");
            }catch (SQLException e){
                txt.setText("插入两条数据失败");
            }
        }
        private void deleteItem(){
            try {
                db.delete(TABLE_NAME,"TITLE='城市'",null);
                txt.setText("删除城市的记录");
            }catch (SQLException e){

            }
        }
        protected void showItems(){
            String col[]={TITLE,BODY};
            Cursor cur=db.query(TABLE_NAME,col,null,null,null,null,null);
            Integer num=cur.getCount();
            String s="";
            if(num>0){
                cur.moveToFirst();
                s="第一条记录:\n"+cur.getString(0)+cur.getString(1);
            }
            txt.setText("共有"+(num)+"条记录\n"+s);
        }
    }


}