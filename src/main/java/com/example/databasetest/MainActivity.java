package com.example.databasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MyDatabaseHelper dbHelper;
    private List<Book> bookList = new ArrayList<Book>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        dbHelper = new MyDatabaseHelper(this, "Library.db", null, 2);
        Button createDatabase = (Button) findViewById(R.id.create_database);
        createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.getWritableDatabase();
            }
        });
        Button addData = findViewById(R.id.add_data);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,AddBookActivity.class);
                startActivity(intent);
            }
        });


        initBooks();
        BookAdapter adapter = new BookAdapter(MainActivity.this, R.layout.booklist, bookList);
        ListView listView = (ListView) findViewById(R.id.booklist);
        listView.setAdapter((ListAdapter) adapter);
    }

    private void initBooks() {
        Book ats = new Book("《安徒生童话》","1","28");
        bookList.add(ats);
        Book gl = new Book("《格林童话》","1","22");
        bookList.add(gl);
        Book cfz = new Book("《草房子》","2","28");
        bookList.add(cfz);
        Book ll = new Book("《流浪地球》","3","25");
        bookList.add(ll);
        Book ba = new Book("《白夜行》","3","38");
        bookList.add(ba);
        Book st = new Book("《三体》","3","28");
        bookList.add(st);

    }
}