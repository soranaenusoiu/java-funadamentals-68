package com.sda.codingFundamentals;

//Write an application that reads a text from the user (type String) and checks whether the
//        user sneezed, i.e. whether the text equals ‘achooo!’ with one or more letter "o" at the end
//        of the expression (so both 'acho!' and 'achooooooo!’ are correct). Hint: use a regular
//        expression with the appropriate quantifier

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserati un string ");
        String sneeze = scanner.nextLine();

        System.out.println(sneezed(sneeze));


    }
    public static boolean sneezed (String sneeze){
        Pattern pattern = Pattern.compile("acho+!");
        Matcher  matcher = pattern.matcher(sneeze);
        boolean isSneeze = false;
        while (matcher.find()) {
            isSneeze = true;
            return isSneeze;
        }
        return matcher.matches();

    }

}
