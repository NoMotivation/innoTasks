package ru.innopolis.java.homeworks.homework04;

//Задана строка, состоящая из букв английского алфавита, разделенных одним пробелом.
// Необходимо каждую последовательность символов упорядочить по возрастанию и вывести слова в нижнем регистре.
//
//Входные данные: в единственной строке последовательность символов представляющее два слова.
//Выходные данные: упорядоченные по возрастанию буквы в нижнем регистре.


import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //bca bca --> abc abc
        String fullString = scanner.nextLine().toLowerCase();

        String firstString = fullString.substring(0, fullString.lastIndexOf(" "));
        String secondString = fullString.substring(firstString.length() + 1);

//        String firstString = scanner.next().toLowerCase();
//        String secondString = scanner.next().toLowerCase();

        System.out.println(readyTo(firstString).append(" ").append(readyTo(secondString)));
    }
    private static StringBuilder readyTo(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        StringBuilder tempStr = new StringBuilder();
        for (char elt : charArray){
            tempStr.append(elt);
        }
        return tempStr;
    }
}
