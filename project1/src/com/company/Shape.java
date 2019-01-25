package com.company;

public class Shape {

    private String color;
    private  String title;




    public Shape(String c, String t){
        this.color=c;
        this.title=t;
    }
    public String getColor(){
        return this.color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public String toString(){
        return "Shape: { color: "+this.color+"}";
    }
}