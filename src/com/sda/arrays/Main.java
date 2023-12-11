package com.sda.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array unidimensional");

        // Declarare
        int[] numere;
        // Initializare
        numere = new int[3]; // indexii sunt 0, 1, 2
        // sau d+i int[] numere = new int[3];


        //accesarea elementului de pe o anumita pozitie
        System.out.println("Elementul de pe pozitia 1: " + numere[1]);

        numere [1] = 5; // adauga 4 pe pozitia 1 din array
        numere [0] = 10;

        // Parcurgere
        for ( int i = 0; i  < numere.length; i++) {
            System.out.print(numere[i] + " ");
        }
        System.out.println("\nParcurgere cu Foreach");

        // Parcurgerea cu foreach
        for (int numar :
             numere) {
            System.out.println(numar + " ");
        }


        // Declarare + initializare
        long[] array = {5l, 7l, 9l, 15l, 4l};

        // vrem sa modificam ultimul element din array
        array[4] = 100L;

        for (long element :
                array) {
            System.out.println(element);

        }

        /* // Cum citim un array de la tastatura

        Scanner scanner = new Scanner(System.in);  //importa scanner system.in = citire de la tastatura
        System.out.println("Introduceti lungimea arrayului: ");

        int n = scanner.nextInt();
        String [] sir = new String[n];

        for (int i=0; i < sir.length; i++) {
            System.out.println("Introduceti elementul de pe pozitia " + i);
            sir[i] =  scanner.next();
        }

         scanner.close();

        for (String element :
                sir) {
            System.out.print(element + " ");
        }
        System.out.println(); */


        // ARRAY Bidimensionale
        System.out.println(" Array Bidimensional");
        double [] [] matrice = new double [2] [3];

        matrice [0][0] = 5;
        matrice [1][2] = 10;

        //parcurgerea
        for (int i = 0; i < matrice.length; i++) {  //parcurgere randuri
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        //array bidimensioanl dand valorile:
        String [][] names = {{"Ion", "Ana"}, {"Marius", "Ioan", "Teodora"}};

        for (String[] rand:
            names ) {
            for (String name :
                    rand){
                System.out.print(name + "; ");
            }
            System.out.println();

        }

       // System.out.println(names[0][2]); // da eroarea Index out of bounds pe un loc gol in care nu am dat valoare

        //Array bidimensional cu citire de la tastatura
      /*  Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti numarul de randuri: ");
        int n = scanner1.nextInt();
        System.out.println("Introduceti numarul de coloane: ");
        int m = scanner1.nextInt();

        int[][] array2 = new int [n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Introduceti valoarea elementului de pe randul " + i
                + "si coloana " +j );
                array2[i][j] = scanner1.nextInt();
            }
        }
        scanner1.close();

        System.out.println("Arrayul bidimensional citit este ");

        for (int[] rand:
                array2 ) {
            for (int element :
                    rand){
                System.out.print(element + "; ");
            }
            System.out.println();



        }*/

        // Exercitiu: suma numerelor aflate intr-un array unidimensional

        int[] numere9;
        numere9 = new int[3];


        numere9 [0] = 5;
        numere9 [1] = 10;
        numere9 [2] = 15;
        int suma = 0;


        for ( int i = 0; i  < numere9.length; i++) {
            suma += numere9[i];
        }

        System.out.print("Suma este: " + suma );


    }
}
