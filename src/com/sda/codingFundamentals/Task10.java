package com.sda.codingFundamentals;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul int primit este ");
        int numarDeLaUtilizator = scanner.nextInt();

        calculeazaSumDigits(numarDeLaUtilizator);
    }

    public static void calculeazaSumDigits (int numarDeLaUtilizator) {
        int suma = 0;
        int i = numarDeLaUtilizator;

        while ( i != 0) {
            int cifra = i % 10;
            suma = suma + cifra;
            i = i / 10;
        }
        System.out.println(suma);
    }





}
