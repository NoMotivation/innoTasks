package ru.innopolis.java.homeworks.homework03;

public enum TVModels {
    SAMSUNG ("Samsung"),
    LG ("LG"),
    PANASONIC ("Panasonic"),
    PHILIPS ("Philips"),
    SONY ("Sony");

    private final String model;

    TVModels(String model){
        this.model = model;
    }

    @Override
    public String toString(){
        return model;
    }
}
