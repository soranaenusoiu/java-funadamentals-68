package com.sda.codingFundamentals;

import java.util.Scanner;

//Write an application that takes a positive number from the user (type int) and writes all
//        numbers from 1 to the given number, each on the next line, with the following changes:
//        ● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
//        ● in  place  of  numbers  divisible  by  7,  instead  of  a  number  the  program  should  write
//        "Buzz"
//        ● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul primit = ");
        int nuamrul = scanner.nextInt();
        fizzBuzz(nuamrul);

    }

    public static void fizzBuzz(int numarul) {
        for (int i = 1; i <= numarul; i++) {
            if ( i% 3 == 0 && i% 7== 0) {
                System.out.println("Fizz buzz");
            } else if ( i%3 == 0) {
                System.out.println("Fizz");
            } else if  ( i%7 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
