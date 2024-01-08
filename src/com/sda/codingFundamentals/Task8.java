package com.sda.codingFundamentals;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul 1: ");
        double numar1 = scanner.nextInt();
        System.out.println("Numarul 2: ");
        double numar2 = scanner.nextInt();
        System.out.println("Operand: ");
        char operand = scanner.next().charAt(0);


        operatii (numar1, numar2, operand);

    }

    static void operatii (double numar1, double numar2, char operand) {
//        if (operand == '/' && numar2 == 0) {
//            System.out.println("Cannot calculate");
//            return;
//        }
        switch (operand) {
            case '+':
                System.out.println(numar1 + numar2);
                break;
            case'-':
                System.out.println(numar1 - numar2);
                break;
            case'*':
                System.out.println(numar1 * numar2);
                break;
            case'/':
                if (numar2 == 0) {
                    System.out.println("Cannot calculate");
                    break;
                }
                System.out.println(numar1 / numar2);
                break;
            default:
                System.out.println("Invalid symbol");

        }
    }

}
