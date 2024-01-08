package com.sda.codingFundamentals;

import java.util.Scanner;

//Write an application that reads two lowercase letters of the Latin alphabet (type char)
//        and calculates how many characters is there in the alphabet between given letters.
//        Hint - use the ASCII code table and treat the characters as int numbers.

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul char: ");
        char caract1 = scanner.next().charAt(0);
        System.out.println("Introduceti al doilea char: ");
        char caract2 = scanner.next().charAt(0);

        System.out.println("Numarul de caractere dintre cele introduse: " + calculateCharactersBetween(caract1, caract2));
    }

    public static int calculateCharactersBetween (char first, char second) {
//        if (second < first) {
//            char third = first;
//            first = second;
//            second = third;   //pune pe prima poz cel mai mic numar introdus si afiseaza corect negativele
//        }

        int charactersGap = second - first - 1;

        if (charactersGap == -1) {
            charactersGap = 0;
        }

        if (charactersGap < 0) {
//           charactersGap = charactersGap +2;
            charactersGap = -(charactersGap +2);  // transformat din negativ in poz
        }
        // sau doua chargap pt cazuri poz si neg
        return charactersGap;

    }
}
