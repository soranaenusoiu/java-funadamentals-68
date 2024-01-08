package com.sda.codingFundamentals;

import java.util.Scanner;

//Write an application that takes 10 numbers from the user (type int) and write the length
//        of the longest such subsequence of these numbers, which is increasing.
//        For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5"
//        as the length of the longest increasing subsequence (underlined in the example).

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Numarul " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Numarul maxim al secventei este " + verificaSecventa(numbers));

    }

    public static int verificaSecventa(int[] numbers) {
        int lastCheckedNumber = 0;
        int currentLength = 0;
        int maximumLength = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (lastCheckedNumber <= numbers[i]) {
                currentLength += 1;

            } else {
                if (maximumLength < currentLength) {
                    maximumLength = currentLength;
                }
                currentLength = 1;
            }
            lastCheckedNumber = numbers[i];
        }
        if (maximumLength < currentLength) {
            maximumLength = currentLength;
        }
        return maximumLength;
    }
}
