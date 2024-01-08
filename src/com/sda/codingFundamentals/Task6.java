package com.sda.codingFundamentals;

import java.util.Scanner;

//Write an application that takes a number n from the user (type int) and calculates the
//        sum of the harmonic series from 1 to n, according to the formula below:
public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati numar pozitiv ");
        int n = scanner.nextInt();
        double v = calculateSumaArmonica(n);
        System.out.println("Suma armonica este " + v);
    }

    public static double calculateSumaArmonica(int n) {
        if (n <= 0){
            return 0;
        }

        double suma = 0;
        for (int i = 1;  i <= n; i++) {
            suma += 1.d/i;
        }
        return suma;
    }

}
