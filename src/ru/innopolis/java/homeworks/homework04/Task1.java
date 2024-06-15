package ru.innopolis.java.hw4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mySymbol = scanner.nextLine();

        findLeftLetter(mySymbol);
    }

    private static void findLeftLetter(String string) {
        final StringBuilder alphabet = new StringBuilder("qwertyuiopasdfghjklzxcvbnm");
        if (string.trim().compareTo("q") == 0) {
            System.out.println("m");
        } else {
            StringBuilder anyAlph = alphabet.reverse();
            int numberOfRevSymbol = 0;
            for (int i = 0; i < anyAlph.length(); i++) {
                if (string.compareTo(Character.toString(anyAlph.charAt(i))) == 0) {
                    numberOfRevSymbol = i;
                    break;
                } else if ((string.compareTo(Character.toString(anyAlph.charAt(i))) != 0)
                        && (i == anyAlph.length() - 1)) {
                    numberOfRevSymbol = Integer.MIN_VALUE;
                }
            }
            if (numberOfRevSymbol == Integer.MIN_VALUE){
                System.out.println("Некорректный символ");
            } else {
                System.out.println(anyAlph.charAt(numberOfRevSymbol + 1));
            }
        }
    }
}
