package com.sda.teme.tema2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student Maria = new Student("Maria", LocalDate.parse("1990-12-01"), 14);
        Student Ion = new Student("Ion", LocalDate.parse("1990-12-14"), 15);
        System.out.println(" " + Student.getNumarTotalStudenti());

        Maria.setNoteStudent (new int[]{1,2,2});
        System.out.printf("Media notelor este %.2f \n", Maria.mediaNotelorStudent());


        System.out.println("Varsta Mariei este: " + Maria.getVarsta());
        System.out.println("Varsta lui Ion este: " + Ion.getVarsta());
        System.out.println("Codul student al Mariei este " + Maria.getcodstudent());
    }
}
