package com.sda.methods;

public class Main {
    public static void main(String[] args) {

        String name = "Alexandra";
        System.out.println("Hello, " + name);
//        System.out.println("Hello, Andreea");
//        System.out.println("Hello, Sorin");
//        System.out.println("Hello, Tiberiu");
//        System.out.println("Hello, Virgil");

        // apelul metodei
        afisareMesaj("Andrei");

        int a = 10;
        double b = 5.5;
        double sum = a + b;

        System.out.println(sumaNumerelor(a,b));

        int c = 3;
        System.out.println(sumaNumerelor(c,sumaNumerelor(a,b))); // sumaNumerelor(c,15.5)

        sum = sumaNumerelor(a,c);
        System.out.println("Suma: " + sumaNumerelor(a,c));
        System.out.println("Suma: " + sum);

        System.out.println(sumaNumerelor(b,a,c));

        System.out.println(sumaNumerelor(new double[]{1,2,3}));
        System.out.println(sumaNumerelor(1,2, 7, 8));
        System.out.println(sumaNumerelor(1,2,3, 10, 15));
        System.out.println(sumaNumerelor("Suma este:",55,78));

        System.out.println(mediaNumerelor(1,2,3,4));

    }

    // modificator de acces + static + tip_returnare + denumirea_metodei (lista_parametri)
    // daca nu specificam un modificator de acces, acesta va fi default
    static void afisareMesaj(String name) {
        System.out.println("Hello from method, " + name);
    }

    static double sumaNumerelor (int x, double y) {
        // double s = x + y;
        return x + y;
    }

    // supraincarcarea metodei sumaNumerelor (acelasi nume, dar lista de param diferita)
    static int sumaNumerelor (int x, int y) {
        return x + y;
    }

    static double sumaNumerelor (double x, int y, int z) {
        return x + y + z;
    }

    // supraincarcarea metodei sumaNumerelor astfel incat sa primeasca ca parametru un array
    // in cadrul metodei sa se parcurga array-ul si sa se intoarca suma elementelor sale
    static double sumaNumerelor (double[] numere) {
        double suma = 0;
        for (double numar : numere) {
            suma += numar; // suma = suma + numar;
        }
        return suma;
    }

    // varargs
    static double sumaNumerelor (int... args) {
        int suma = 0;
        for (int numar : args) {
            suma += numar; // suma = suma + numar;
        }
        return suma;
    }

    static String sumaNumerelor (String mesaj, int... args) {
        int suma = 0;
        for (int numar : args) {
            suma += numar; // suma = suma + numar;
        }
        return mesaj + " " + suma;
    }

    // creati o metoda care sa realizeze media numerelor primite ca param
    // sa folositi apelul metodei sumaNumerelor
    static double mediaNumerelor(int...args)
    {
        return sumaNumerelor(args)/args.length;
    }

}

























/*package com.sda.methods;

public class Main {
    public static void main(String[] args) {

        String name = "Sorana";
        System.out.println("Hello, " + name);
        System.out.println("Hello, Andreea");
        System.out.println("Hello, Sorin");
        System.out.println("Hello, Tiberiu");
        System.out.println("Hello, Virgil");

        //apelul metodei
        afisaremesaj("Alin");

        int a = 10;
        double b = 5.5;
        double sum = a + b;


        System.out.println(sumaNumerelor(a, b));

        int c = 3;
        System.out.println(sumaNumerelor(c, sumaNumerelor(a, b)));  // sumaNumerelor(c, 15.5)

        sum = sumaNumerelor(a, c);
        System.out.println("Suma: " + sumaNumerelor(a, c));
        System.out.println("Suma: " + sum);

        System.out.println(sumaNumerelor(b, a, c));
       // EXERCITIU
        int suma = 0;
        System.out.println(sumaElementelor(suma));

       // System.out.println(sumaNumerelor(new double[] {1,2,3}));
       // System.out.println(sumaNumerelor(1, 2, 7, 8));
       // System.out.println(sumaNumerelor(1, 2, 3, 10, 15));


    }

    // Modificator de acces + static + tip returnare + denumirea_metodei (lista_parametri)
    // daca nu specificam un modificator de acces, acesta va fi default
    static void afisaremesaj(String name) {
        System.out.println("Hello from method, " + name);
    }

    static double sumaNumerelor(int x, double y) {
        //double s = x + y;
        return x + y;
    }

    // Supraincarcarea medodei sumaNumerelor = acelasi nume dar lista de parametri diferita
    static int sumaNumerelor(int x, int y) {
        return x + y;
    }

    static double sumaNumerelor(double x, int y, int z) {
        return x + y + z;
    }

    // EXERCITIU Supraincarcarea metodei sumaNumerelor astfel incat sa primeasca ca parametru un array
    // in cadrul metodei sa se parcurga array-ul si sa se intoarca suma elementelor sale
    // apelati din Main
    static int  sumaElementelor (int suma) {
        int[] numere9;
        numere9 = new int[3];


        numere9[0] = 5;
        numere9[1] = 10;
        numere9[2] = 15;
        suma = 0;


        for (int i = 0; i < numere9.length; i++) {
            suma += numere9[i];
        }


        return suma;

    }
    //Varargs
   // static double sumaNumerelor (int... args) {
    //    int suma = 0;
     //   for (int numar : args ) {
      //      suma += numar; //suma= suma + numar
      //  }
      //  return suma;
  //  }

    //Exercitiu: creati o metoda care sa relizeze media numerelor primita ca parametru + folositi apelul metodei sumaNumerelor

  //  static int mediaNumerelor ()
}
*/