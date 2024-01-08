package com.sda.codingFundamentals;

import java.util.Random;
import java.util.Scanner;

//Write an application that will play "too much, too little" game with you. At the beginning
//        the  application  should  randomly  choose  a  number  from  0  to  100  (hint:  use  the
//        Random.nextInt() method) and wait for the user to enter a number. If the user gives a
//        number greater than the number chosen by the computer, your application should print
//        "too  much"  and  wait  for  the  next  number.  If  the  user  gives  a  smaller  number,  the
//        application should print "not enough" and wait for the next number in the same way. If
//        the  user  provides  the  exact  value,  the  application  should  print  the  word
//        "Congratulations!" and finish.

public class Task20 {
    public static void main(String[] args) {
        Random ran = new Random();
        int number = ran.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar pana la 100:  ");
        int numarIntrodus = scanner.nextInt();
        while (game(numarIntrodus,number) == false) {
            System.out.println("Introduceti un numar pana la 100:  ");
            numarIntrodus = scanner.nextInt();
        }

    }

    public static boolean game(int numarIntrodus, int number) {
        if (numarIntrodus > number) {
            System.out.println("too much");
        } else if (numarIntrodus < number) {
            System.out.println("too little");
        } else {
            System.out.println("Congratulations!");
            return true;
        }
        return false;
    }

}
