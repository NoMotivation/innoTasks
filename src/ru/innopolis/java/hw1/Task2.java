package ru.innopolis.java.hw1;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        int vasya = (int) (Math.random() * 3);
        int petya = (int) (Math.random() * 3);
        HashMap<Integer, String> kmnGame = new HashMap<>();
        kmnGame.put(0, "камень");
        kmnGame.put(1, "ножницы");
        kmnGame.put(2, "бумага");
        kmnGame.put(3, "Вася");
        kmnGame.put(4, "Петя");
        String result = "" + vasya + petya;
        String stringResult = switch (result){
            case "01", "20", "12" -> "Победил " + kmnGame.get(3);
            case "10", "02", "21" -> "Победил " + kmnGame.get(4);
            default -> "Ничья";
        };
        System.out.println("Вася: " + kmnGame.get(vasya) + "\nПетя: " + kmnGame.get(petya) + "\n" + stringResult);
    }
}
