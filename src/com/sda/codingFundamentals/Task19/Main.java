package com.sda.codingFundamentals.Task19;
//Write an application that consists of few classes:
//        a. Author class, representing an author – poem writer, which consists of fields surname
//        and nationality (both of type String)
//        b. Poem class, representing poem, which consists of fields creator (type Author) and
//        stropheNumbers (type int – numbers of strophes in poem)
//        c. Main class, with main method, inside which you will:
//        i. Create  three  instances  of  Poem  class,  fill  them  with  data  (using  constructor
//        and/or setters) and store them in array
//        ii. Write a surname of an author, that wrote a longest poem (let your application
//        calculate it!)

public class Main {
    public static void main(String[] args) {

        Poem[] array = {
                new Poem(new Author("Bacovia", "George"), 3),
                new Poem(new Author("Eminescu", "Mihai"), 7),
                new Poem(new Author("Toparceanu", "George"), 2),
        };
        int indexPoem = 0;
        int numarMaximStrofe = 0;
        for (int i = 0; i < array.length; i++){
         //   System.out.println(array[i].getAuthor().getNume() + " " + array[i].getAuthor().getPrenume() + " " + array[i].getStropheNumbers());
            if (array[i].getStropheNumbers() > numarMaximStrofe ) {
                indexPoem = i;
                numarMaximStrofe = array[i].getStropheNumbers();
            }
        }
        System.out.println(array[indexPoem].getAuthor().getNume());
    }

}
