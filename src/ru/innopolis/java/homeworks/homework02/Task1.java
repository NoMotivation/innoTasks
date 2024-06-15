package ru.innopolis.java.homeworks.homeworks02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите степень в градусах Фаренгейта: ");
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
        int result = (myNumber - 32) * 5 / 9;
        System.out.println(Integer.toString(myNumber) + " градусов по Фаренгейту равна " + Integer.toString(result) +
                " по Цельсию");
    }
}
