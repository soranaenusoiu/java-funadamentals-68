package com.sda.codingFundamentals;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti diametrul: ");
        float diametru = scanner.nextFloat();
        calculeazaPerimetru(diametru);
        calculeazaPerimetru2(diametru);
    }

    public static void calculeazaPerimetru (float diametru) {
        final float PI = 3.14f;
        float result = diametru * PI;
        System.out.println("Perimetrul este: " + result);
    }

    public static void calculeazaPerimetru2 (float diametru) {
        float result = (float)Math.PI*diametru;
        System.out.println("Perimetrul este: " + result);
    }
}
