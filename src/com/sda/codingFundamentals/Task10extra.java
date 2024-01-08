package com.sda.codingFundamentals;

import java.util.Scanner;

public class Task10extra {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        number = scanner.nextInt();
        System.out.println(calculeazaSumaCifrelor2(number));

    }

    private static int calculeazaSumaCifrelor(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    private static int calculeazaSumaCifrelor2(int number) {
        String numarString = String.valueOf(number);
        int sum = 0;
        char[] digits = numarString.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            sum = sum + digits[i] - '0';
            // sum = sum + Integer.parseInt(String.valueOf(digits[i]));
        }
        return sum;
    }
}
