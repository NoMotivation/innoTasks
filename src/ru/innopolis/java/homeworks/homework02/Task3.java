package ru.innopolis.java.homeworks.homework02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Исходная строка: ");
        String initialString = scanner.nextLine();
        System.out.println("Сколько раз вывести строку? ");
        int countString = scanner.nextInt();
        String resultString = initialString;
        int i = 1;
        while (i < countString){
            resultString += initialString;
            i++;
        }
        System.out.println(resultString);
    }
}
