package com.sda.codingFundamentals;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        System.out.println("c = ");
        int c = scanner.nextInt();

        rezolveEquation(a,b,c);


    }

        public static void rezolveEquation (int a, int b, int c) {

             double delta = Math.pow(b,2) - 4*c*a;
             if (delta < 0) {
                 System.out.println("Delta este negativ ");
                 return;
             }

             double x1 = (-b- Math.sqrt(delta)) / (2*a);
             double x2 = (-b+ Math.sqrt(delta)) / (2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);


        }


}
