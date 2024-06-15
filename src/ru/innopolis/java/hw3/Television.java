package ru.innopolis.java.hw3;

import java.text.DecimalFormat;

public class Television {
    private TVModels tvModel;
    private double price;
    private double priceWithDiscount;
    
    public Television(TVModels tvModel, double price){
        this.tvModel = tvModel;
        this.price = price;
        this.priceWithDiscount = price;
    }

    public String getTvModel(){
        return tvModel.toString();
    }

    public void setTvPrice(double price) {
        this.price = price;
        this.priceWithDiscount = price;
    }

    public void setDiscountPrice(double priceWithDiscount){
        this.priceWithDiscount = priceWithDiscount;
    }

    public double getTvPrice(){
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        return Double.parseDouble(decimalFormat.format(this.priceWithDiscount).replace(",", "."));
    }

    public double priceWithDiscount(int discount){
        priceWithDiscount = price * (100 - discount) / 100;
        return this.priceWithDiscount;
    }

    @Override
    public String toString() {
        return "Ваш телевизор: " + tvModel +
                "\nЕго цена: " + this.getTvPrice();
    }
}

