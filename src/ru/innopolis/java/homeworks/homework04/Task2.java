package ru.innopolis.java.homeworks.homework04;

//Задана последовательность, состоящая только из символов ‘>’, ‘<’ и ‘-‘. Требуется найти количество стрел,
// которые спрятаны в этой последовательности. Стрелы – это подстроки вида ‘>>-- >’ и ‘< --<<’.
//
//Входные данные: в первой строке входного потока записана строка, состоящая из символов ‘>’, ‘<’ и ‘-‘
// (без пробелов). Строка может содержать до 106 символов.
//
//Выходные данные: в единственную строку выходного потока нужно вывести искомое количество стрелок.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //string: >>-->-><<<><><>>--><--<<>>-->>><><--<<--<<>>>>----->>--><<---<<--<<<-<<>>-->>--> //10
        String fullString = scanner.nextLine();

        findSubstring(fullString);
    }

    private static void findSubstring(String initialStr){
        int count = 0;
        Pattern pattern = Pattern.compile(">>(?=-->)|(?<=<--)<<"); //начало одной может являться концом другой
        Matcher matcher = pattern.matcher(initialStr);

        while(matcher.find()){
            count++;
        }

        System.out.println(count);
    }
}


//        String tydi = ">>-->";
//        String sydi = "<--<<";
//        int count = 0;
//        for (int i = 0; i < fullString.length() - tydi.length() + 1; i++) {
//            final String substring1 = fullString.substring(i, i + tydi.length());
//            final String substring2 = fullString.substring(i, i + sydi.length());
//            if ((substring1.compareTo(tydi) == 0) ||
//                    (substring2.compareTo(sydi) == 0)){
//                count++;
//            }
//        }
//        System.out.println(count);
//        bruteForce(fullString);


/*    private static void bruteForce(String initialSTr){
        char[] charOfString = initialSTr.toCharArray();
        int countPosl = 0;
        for (int i = 0; i < charOfString.length - 1; i++) {
            if (       (charOfString[i] == '>'
                    && charOfString[i + 1] == '>'
                    && charOfString[i + 2] == '-'
                    && charOfString[i + 3] == '-'
                    && charOfString[i + 4] == '>')
                    || (charOfString[i] == '<'
                    && charOfString[i + 1] == '-'
                    && charOfString[i + 2] == '-'
                    && charOfString[i + 3] == '<'
                    && charOfString[i + 4] == '<')) {
                countPosl++;
            }
        }
        System.out.println(countPosl);
    }*/