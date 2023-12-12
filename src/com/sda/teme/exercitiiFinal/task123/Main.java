package com.sda.teme.exercitiiFinal.task123;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul dat de utilizator este: ");
        int number = scanner.nextInt();

        testNumar(number);
        numarPar(number);
        System.out.println("Suma primelor " + number + " numere naturale este: " + sumaNumerelorNaturale(number));
    }
    //1.Scrieti o metoda care sa verifice daca un numar real citit de la tastatura este pozitiv,
   // negativ sau zero.

    public static void testNumar(int number) {
        if (number < 0) {
            System.out.println("Numarul mai mic decat zero");
        } else if (number > 0) {
            System.out.println("Numarul este mai mare decat zero");
        } else {
            System.out.println("Numarul este zero");
        }
    }
    //2. Scrieti o metoda care sa determine daca un numar citit de la tastatura este par sau impar
    public static void numarPar(int number) {
        if ( (number % 2) == 0 ) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }
    }
    //3. Scrieti o metoda care sa calculeze suma primelor N numere naturale, unde N este introdus
    //de utilizator.
    public static int sumaNumerelorNaturale(int number) {
    int suma = 0;
        for (int i = 1; i <= number; i++) {
        suma += i;
    }
        return suma;
    }
}
