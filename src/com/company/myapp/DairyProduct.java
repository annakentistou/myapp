package com.company.myapp;

public class DairyProduct extends Product{
    private String producer;

    //constructor
    public DairyProduct(String code, String name, float price, int quantity, String producer) {
        super(code, name, price, quantity);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return super.toString()+
                "DairyProduct{" +
                "producer='" + producer + '\'' +
                '}';
    }
}
