package com.sda.codingFundamentals;

//Write an application that will read from the user the date of your next SDA classes and
//        calculate how many days are left to them.
//        Hint: read the date as String and parse it to LocalDate. Get the current date using
//        LocalDate.now() method.
//

import java.time.*;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserati data urmatorului curs ");
        String textData = scanner.nextLine();

        LocalDate dataCurs = LocalDate.parse(textData);
        LocalDate dataCurenta = LocalDate.now();
        long daysBetween = DAYS.between(dataCurenta, dataCurs);
        System.out.println("Zile pana la curs: " + daysBetween);

//        long zile = dataCurs.toEpochDay() - dataCurenta.toEpochDay();
//        System.out.println(zile);
    }
}
