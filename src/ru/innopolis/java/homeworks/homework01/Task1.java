package ru.innopolis.java.homeworks.homework01;

public class Task1 {
    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomValue = (int) (Math.random() * 201 - 100); //рандомное целочисленное значение [-100;100]
            result += randomValue + " ";
        }
        System.out.println(result.substring(0, result.length() - 1));
    }
}
