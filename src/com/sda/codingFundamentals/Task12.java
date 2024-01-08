package com.sda.codingFundamentals;

import java.util.Scanner;

//Write an application that reads a text from the user (type String) and counts a percentage
//        of occurrences of a space character.

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti string: ");
        String textReader = scanner.nextLine();

        float calculatePercentage = (float)calculateSpaces(textReader) * 100 / textReader.length();
        System.out.printf("%.2f", calculatePercentage);
        System.out.print("%");
    }

    public static int calculateSpaces (String string) {
        int totalSpaces = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ' ) {
                totalSpaces++;
            }
        }
        return totalSpaces;
    }
}
