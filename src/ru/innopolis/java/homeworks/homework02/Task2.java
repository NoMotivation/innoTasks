package ru.innopolis.java.homeworks.homeworks02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-е целое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();
        int sum = Math.addExact(firstNumber, secondNumber);
        int sub = Math.subtractExact(firstNumber,secondNumber);
        int multiple = Math.multiplyExact(firstNumber, secondNumber);
        double average = Math.floorDiv(sum, 2);
        String averageTwoSign = String.format("%.2f", average);
        int absolute = Math.abs(sub);
        int maxValue = Math.max(firstNumber, secondNumber);
        int minValue = Math.min(firstNumber, secondNumber);
        System.out.println(
                "Сумма двух целых чисел: " + Integer.toString(sum) + "\n" +
                "Разница двух целых чисел: " + Integer.toString(sub) + "\n" +
                "Произведение из двух целых чисел: " + Integer.toString(multiple) + "\n" +
                "Среднее из двух целых чисел: " + averageTwoSign + "\n" +
                "Расстояние двух целых чисел: " + Integer.toString(absolute) + "\n" +
                "Максимальное целое число: " + Integer.toString(maxValue) + "\n" +
                "Минимальное целое число: " + Integer.toString(minValue));
    }
}
