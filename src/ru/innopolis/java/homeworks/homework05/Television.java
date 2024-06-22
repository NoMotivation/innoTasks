package ru.innopolis.java.homeworks.homework05;

import java.text.DecimalFormat;
import java.util.Objects;

public class Television {
    private TVModels tvModel;
    private double price;
    private double priceWithDiscount;
    private Integer channel;
    private Integer volume;
    private boolean isTurnOn;

    public Television(){}

    public Television(TVModels tvModel, double price, Integer channel, Integer volume, boolean isTurnOn){
        this.tvModel = tvModel;
        this.price = price;
        priceWithDiscount = price;
        this.channel = channel;
        setVolume(volume);
        this.isTurnOn = isTurnOn;
    }

    public void setVolume(Integer volume){
        if (volume < 0 || volume > 100) {
            System.out.println("Некорректное значение громкости");
            throw new IllegalArgumentException("Некорректное значение громкости");
        }
        this.volume = volume;
    }

    public void setTvModel(TVModels tvModel){
        this.tvModel = tvModel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public void setIsTurnOn(boolean isTurnOn){
        this.isTurnOn = isTurnOn;
    }

    public void setTvPrice(double price) {
        this.price = price;
        priceWithDiscount = price;
    }

    public void setDiscountPrice(double priceWithDiscount){
        this.priceWithDiscount = priceWithDiscount;
    }

    public String getTvModel(){
        return tvModel.toString();
    }

    public double getTvPrice(){
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        return Double.parseDouble(decimalFormat.format(priceWithDiscount).replace(",", "."));
    }

    public Integer getChannel(){
        return channel;
    }

    public Integer getVolume(){
        return volume;
    }

    public boolean getIsTurnOn(){
        return isTurnOn;
    }

    public double priceWithDiscount(int discount){
        priceWithDiscount = price * (100 - discount) / 100;
        return priceWithDiscount;
    }

    @Override
    public String toString() {
        return "Television{" +
                "tvModel=" + tvModel +
                ", price=" + price +
                ", priceWithDiscount=" + priceWithDiscount +
                ", channel=" + channel +
                ", volume=" + volume +
                ", isTurnOn=" + isTurnOn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return Double.compare(price, that.price) == 0 && Double.compare(priceWithDiscount, that.priceWithDiscount) == 0 && isTurnOn == that.isTurnOn && tvModel == that.tvModel && Objects.equals(channel, that.channel) && Objects.equals(volume, that.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tvModel, price, priceWithDiscount, channel, volume, isTurnOn);
    }
}

