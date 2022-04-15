package com.example.databasetest;

public class Book {
    private String name;
    private String type;
    private String price;

    public Book(String name,String type,String price){
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }
}
