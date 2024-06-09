package ru.innopolis.java.hw3;

import java.text.DecimalFormat;

public class Television {
    private final TVModels tvModels;
    private double price;
    
    public Television(TVModels tvModels, double price){
        this.tvModels = tvModels;
        this.price = price;
    }

    public String getModelInfo(){
        return tvModels.toString();
    }

    public double getInfoPrice(){
        return price;
    }

    public double priceWithDiscount(int discount){
        return (price * (100 - discount) / 100);
    }

    public void setDiscountPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        DecimalFormat format = new DecimalFormat("#.#");
        return "Ваш телевизор: " + tvModels + "\nЕго цена: " + format.format(price).replace(",", ".");
    }

}
