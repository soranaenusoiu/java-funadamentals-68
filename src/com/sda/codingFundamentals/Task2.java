package com.sda.codingFundamentals;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti greutate ");
        double weight = scanner.nextDouble();
        System.out.println("Introduceti inaltimea in metri ");
        double heightMetri = scanner.nextDouble();
        System.out.println("Introduceti inaltimea in centrimeti ");
        double heightCentrimetri = scanner.nextDouble();

        double bmi = calculateBMICentrimetri(weight, heightCentrimetri);
        System.out.println("Bmi in centimetri " + bmi);
        checkRange(bmi);

        System.out.println(("Bmi in metri " + bmi));
        checkRange(calculateBMI(weight,heightMetri));


    }

    public static double calculateBMI (double weight, double height) {

        return weight/Math.pow(height,2);

    }

    public static double calculateBMICentrimetri (double weight, double height) {

        height = height/100;
        return weight/Math.pow(height,2);

    }

    public static void checkRange (double bmi) {
        if (bmi < 18.5 || bmi > 24.9) {
            System.out.println("Bmi not optimal");
        } else {
            System.out.println("Bmi is optimal");
        }
    }


}
