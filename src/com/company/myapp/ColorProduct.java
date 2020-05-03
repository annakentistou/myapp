package com.company.myapp;

//implements make Product printable
public class ColorProduct extends Product implements Printable{
    //fields
    private String color;

    //constructor
    public ColorProduct(String code, String name, float price, int quantity, String color) {
        super(code, name, price, quantity);
        this.color = color;
    }
    //setters - getters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //toString
    @Override
    public String toString() {
        return super.toString()+
                "ColorProducts{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Color "+color);
    }
}
