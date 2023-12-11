package com.sda.conditionals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("IF");
        double tempreture = 6;
        if (tempreture <= 0) {
            //ce se executa daca conditia este adevarata
            //putem elimina acoladele dar ATENTIE se va executa doar prima instructiune
            //de rgeula chiar dca avem o singura instructiune in If PUNEM ACOLADA
            System.out.println("Afara este frig");
        }
        System.out.println("Temperatura este " + tempreture);

        if (tempreture <= 0) {
            System.out.println("Afara este frig");
        } else {
            //ce se executa daca conditia este falsa
            System.out.println("Afara este decent");
        }

        // Exercitiu: verificati daca un numar este par sau impar
        // %2 = restul impartirii la 2
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg: ");
        int numar = scanner.nextInt();
        if(numar %2 == 0) {
            System.out.println("Numarul este par" + numar);
        } else {
            System.out.println("Numarul este impar" + numar);
        }

        tempreture = 26;
            if (tempreture <= 0) {
                // ce se executa este temperatura ester <= 0
                System.out.println("Afara ester frig");
            } else if (tempreture <= 20) {
                // ce se executa daca temperatura este > 0 si <= 20\
                // (0, 20]
                System.out.println("Afara este decent");
            } else {
                // ce se executa daca temperatura este > 20
                System.out.println("Afara este cald");
            }
*/
            // Exemplu cu Switch

        System.out.println("SWITCH");
            Scanner scanner1 = new Scanner(System.in);
            int zi = scanner1.nextInt();

        System.out.println("Ziua saptamanii este " + zi);
        switch (zi) {
            case 1:
                System.out.println("Luni");
                break; // iese din structura switch
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Valoarea nu corespunde unei zile a saptamanii");

        }





    }
}
