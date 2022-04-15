package com.example.databasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddBookActivity extends AppCompatActivity {

    private MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);


        Button addData1 = findViewById(R.id.add_data1);
        addData1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                //开始组装第一条数据
                values.put("name", "The Da Vinci Code");
                values.put("author", "Dan Brown");
                values.put("pages", 454);
                values.put("price", 16.96);
                db.insert("Book", null, values);//插入第一条数据
                values.clear();
//                //组装第二条数据
//                values.put("name", "The Lost Symbol");
//                values.put("author", "Dan Brown");
//                values.put("pages", 510);
//                values.put("price", 19.95);
//                db.insert("Book", null, values);//插入第二条数据
                    }
                });

        Button addData2 = findViewById(R.id.add_data2);
        addData2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                //开始组装第一条数据
                values.put("name", "《阿甘正传》");
                values.put("author", "Winston Groom");
                values.put("pages", 454);
                values.put("price", 24.88);
                db.insert("Book", null, values);//插入第一条数据
                values.clear();
            }
        });
        Button addData3 = findViewById(R.id.add_data2);
        addData3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                //开始组装第一条数据
                values.put("name", "《活着》");
                values.put("author", "余华");
                values.put("pages", 342);
                values.put("price", 16);
                db.insert("Book", null, values);//插入第一条数据
                values.clear();
            }
        });

            }
        }
