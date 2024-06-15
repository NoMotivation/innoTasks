package ru.innopolis.java.homeworks.homeworks02;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк и столбцов сетки: ");
        int number = scanner.nextInt();
        System.out.println("Введите повторяемый элемент сетки: ");
        char symbol = scanner.next().charAt(0);
        char[][] repeatSymbol = new char[number][number];
        System.out.println("Сетка по запросу " + Integer.toString(number) + " на " + Integer.toString(number));
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                repeatSymbol[i][j] = symbol;
            }
            System.out.println(repeatSymbol[i]);
        }
    }
}
