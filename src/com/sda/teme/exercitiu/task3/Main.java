package com.sda.teme.exercitiu.task3;
import java.util.Scanner;
public class Main {
    private static int suma;

    public static void main(String[] args) {
        Scanner numarNatural = new Scanner(System.in);
        System.out.println("Numar natural primit este: ");

        int n = Integer.parseInt(numarNatural.nextLine());
       
        System.out.println("Suma numerelor naturale pana la n este: " + suma);
    }
}
