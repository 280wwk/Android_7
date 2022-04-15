package com.example.databasetest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends ArrayAdapter {
    private final int resourceId;

    public BookAdapter(Context context, int textViewResourceId, List<Book> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Book book = (Book) getItem(position); // 获取当前项的Phone实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);//实例化一个对象
        TextView bookName = (TextView) view.findViewById(R.id.name);//获取该布局内的文本视图
        TextView bookType = (TextView) view.findViewById(R.id.type);
        TextView bookPrice = (TextView) view.findViewById(R.id.price);
        bookName.setText(book.getName());//为文本视图设置文本内容
        bookType.setText(book.getType());
        bookPrice.setText(book.getPrice());


        return view;
    }
}
