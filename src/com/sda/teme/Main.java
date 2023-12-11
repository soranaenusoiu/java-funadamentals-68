package com.sda.teme;

public class Main {
    public static void main(String[] args) {
        // TEMA Cum s-ar scrie exercitiul de mai sus folosind WHILE
        int minNumber = 7, maxNumber = 25;
        int numarExtras = 0;
        int k = minNumber;
        while (minNumber <= k && k <= maxNumber) {
            if (k%3 == 0) {
                numarExtras = k;
                break;
            }
            System.out.println(k);
            k++;  //contor
        }
        System.out.println("Numarul nou gasit este: " + numarExtras);

        //Assignemnts din Workbook
        //Assignment 1
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
               System.out.printf("%4s", i*j );
               // System.out.print(i*j + " ");
            }
            System.out.println("");

        }

        //Assignment 2
        System.out.println("");
        int max = 3;
        for (int j = 1; j <= max; j++) {
            System.out.print("+---");
        }
        System.out.println("+");
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                System.out.printf("| %1d ", i * j);
             //   System.out.printf("| %d %d ", i * j, i + j);

            }
            System.out.println("|");
            for (int j = 1; j <= max; j++) {
                System.out.print("+---");
            }
            System.out.println("+");
        }

        //Assignment 3
         for (int i = 1; i <= 8; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print("#");
             }
             System.out.println();
         }
        System.out.println("");

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("");


        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j <= 8 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.println("");


        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j >= i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("");


        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i ==  1 || i == 8 || j == i  ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("");


        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i ==  1 || i == 8 || j == 8 - i + 1 ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("");


        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i ==  1 || i == 8 || j == i || j == 8 - i + 1 ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("");


        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i ==  1 || i == 8 || j == i || j == 8 - i + 1 || j == 1 || j == 8 ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("");


        //Assignment





        //A.3 apelul metodei de la ex 3
        System.out.println("Apel metoda: ");
        exercitiu(11);
    }
        //ultimul exercitiu afistat in cadrul unei metode cu parametrul size
    public static void exercitiu(int size) {

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i ==  1 || i == size || j == i || j == size - i + 1 || j == 1 || j == size ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("");

    }

}
