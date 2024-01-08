package com.sda.codingFundamentals;

import java.util.Scanner;

//Write an application that "stutters", that is, reads the user's text (type String), and prints
//        the given text, in which each word is printed twice.
//        For example, for the input: "This is my test" the application should print "This This is is
//        my my test test"

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti string: ");
        String textReader = scanner.nextLine();

        printedStuttered(textReader);
    }

    public static void printedStuttered (String string) {
        String[] stringSplit = string.split(" ");
        // String stutteredText = "";
        StringBuilder stutteredText = new StringBuilder();
        for ( String word : stringSplit) {
            //    stutteredText = stutteredText.concat(word) + " ";
            //    stutteredText = stutteredText.concat(word) + " ";
            stutteredText.append(word);
            stutteredText.append(" ");
            stutteredText.append(word);
            stutteredText.append(" ");

        }

        System.out.println(stutteredText);
    }

}
