package com.sda.codingFundamentals;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul pozitiv ");
        number = scanner.nextInt();
        printTillIndex(number);

    }

    private static void printTillIndex(int index) {
        int a, b, c;
        a = 1;
        b = 1;
        System.out.print(a + " ");
        index--;
        if (index >= 1){
            System.out.print(b + " ");
            index--;
        }
        while (index > 0) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            index--;
        }
       // System.out.print(b + " "); //pentru ca printa numai ultimul
    }
}
