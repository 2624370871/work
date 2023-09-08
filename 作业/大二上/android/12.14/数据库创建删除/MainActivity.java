package com.example.myapp;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import java.sql.SQLData;

import static com.example.myapp.R.*;

public class MainActivity extends AppCompatActivity {
    Button createBtn,deleteBtn;
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(layout.activity_main);
        createBtn=(Button)findViewById(id.createdb);
        createBtn.setOnClickListener(new mClick());
        deleteBtn=(Button)findViewById(id.deletedb);
        deleteBtn.setOnClickListener(new mClick());
    }
    public class mClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if(v==createBtn){
                MySQLDatabase db=new MySQLDatabase();
                Toast.makeText(MainActivity.this,"数据库和数据表创建成功",Toast.LENGTH_SHORT).show();
            }else if(v==deleteBtn){
                deleteDatabase(MySQLDatabase.Database_name);
                Toast.makeText(MainActivity.this,"数据库删除成功",Toast.LENGTH_SHORT).show();
            }
        }
    }

    class MySQLDatabase {
        static final String Database_name="eBook.db";
        private MySQLDatabase(){
    SQLiteDatabase db;
    String TABLE_NAME="diary";
    String ID="nid";
    String TITLE="title";
    String BODY="body";
    String DATABASE_CREATE="CREATE TABLE IF NOT EXISTS "+TABLE_NAME+"("
            +ID+" INTEGER primary key autoincrement, "
            +TITLE+" text not null, "
            +BODY+" text not null); ";
    int mode= Context.MODE_PRIVATE;
    db=openOrCreateDatabase(Database_name,mode,null);
    db.execSQL(DATABASE_CREATE);
}

    }
}