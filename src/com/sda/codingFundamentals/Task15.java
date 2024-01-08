package com.sda.codingFundamentals;

import java.util.Scanner;

//Write an application that reads from the user 10 arbitrarily large numbers (variables of
//        type int) and prints those that occurred at least twice.

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numar = new int[10];
        for (int i = 1; i <= 10; i++) {
            System.out.print("Numarul " + i + ": ");
            numar[i-1] = scanner.nextInt();
        }


        int[] occurances = calculateOccurances(numar);

        for (int i = 0; i < 10; i++) {
            if (occurances[i] > 1) {
                System.out.println("Numarul " + numar[i] + " apare de " + occurances[i] + " ori");
            }
        }

    }

    public static int[] calculateOccurances(int[] numbers) {
        int[] numberOfOccurances = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            numberOfOccurances[i]++;
            for ( int j = i + 1; j < numbers.length; j++ ){
                if (numbers[i] == numbers[j]) {
                    numberOfOccurances[i]++;
                    numberOfOccurances[j] = -11;
                }
            }
        }

        return numberOfOccurances;
    }
}
