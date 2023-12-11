package com.sda.operators;

public class Main {
    public static void main(String[] args) {

        // a + b, + este operator iar a si b operantzi => a+b = o expresie

        // Operatori unari (au un singur operand)
        // a++, ++a = operatori de post si pre incrementare sau a--, --a post si predecrementare
        // +a e specificarea ca e un numar pozitiv
        // !a este negarea unei expresii booleane

        System.out.println(+7); // aratam explicit faptul ca numarul este pozitiv
        System.out.println(-7); // aratam explicit faptul ca numarul este negativ
        System.out.println((-(-3)));

        boolean isTrue = true;
        System.out.println(!isTrue);

        // post incrementare si post decrementare
        int numar = 7;
        System.out.println("Post-incrementare " + numar++ ); // 7
        System.out.println("Dupa post-incrementare: " + numar);  // 8

        System.out.println("Post-decrementare " + numar-- ); // 8
        System.out.println("Dupa post-decrementare: " + numar); // 7

        // pre-incrementare si post-incrementare
        System.out.println("Pre-incrementare " + ++numar ); // 8
        System.out.println("Dupa pre-incrementare: " + numar);  // 8

        System.out.println("Pre-decrementare " + --numar ); // 7
        System.out.println("Dupa pre-decrementare: " + numar);  // 7

        // Operatori Binari (au doi operanzi)
        // aritmetici: +, -, /,*, % (modulo = restul impartirii)
        //de comparatie: <, >, <=, >=, ==, !=
        // atribuire: =, +=, -=, *=, /=, %=
        // logici: &&, ||
        //pe biti: &, |, ^ xor = sau explicit, >> deplasarea pe biti fara semn, >>> deplasarea pe biti cu semn, <<
        System.out.println((7+5 * 2) % 2);

        int a = 5,b = 7;
        boolean isTrue2 = a < b;
        System.out.println(isTrue2);

        b *= 2; // b = b * 2;
        System.out.println(b);

        boolean isTrue3 = isTrue2 && (3 != 10); // true && true
        // &&
        // daca expresia din stanga este adevarata se evalueaza si expresia din dreapta operatorului
        // daca expresia din stranga este falsa nu se evalueaza si expresia din dreapta operatorului

        // ||
        //daca expresia din stanga este adevarata nu se evalueaza si expresia din dreapta operatorului
        //daca expresia din stanga este falsa  se evalueaza si expresia din dreapta operatorului

        System.out.println(isTrue3);


        // Ordinea operatorilor - de la stanga la dreapta respectand tabelul cu precedenta operatorilor
        a = 6;
        System.out.println(2 * a++ + a-- + 1);
        System.out.println("a = " + a );
        // 2 * 6 + (a--) + 1
        // a devine 7
        // 2 * 6 + 7 + 1 = 12 + 7 + 1 = 20
        // a devine 6

        // Exercitiu
        boolean isValid = ((5 + 3) * 2 > 10) && (7 != 3);
        // 16 > 10  && true
        // true && true => true
        System.out.println(isValid);

        // Operatorul ternar ( are trei operanzi)
        double number = 50;
        boolean isHigherThan30 = (number > 30) ? true : false;
        // daca conditia este adevarata atunci true, altfel false
        String isHigherThan30String = (number > 30) ? "conditia este adevarata" : "conditia este falsa";
        System.out.println(isHigherThan30String);








    }
}
