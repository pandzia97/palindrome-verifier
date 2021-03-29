package com.company;

import java.util.Scanner;

public class Main {
    public static boolean palindrom(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            int end = (sentence.length() - i) - 1;
            if (sentence.charAt(i) != sentence.charAt(end)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = scanner.nextLine();
        System.out.println(palindrom(sentence));
    }
}