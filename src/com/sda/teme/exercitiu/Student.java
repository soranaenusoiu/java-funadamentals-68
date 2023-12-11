package com.sda.teme.exercitiu;


import java.time.LocalDate;
// 1. Creati o clasa pentru gestionarea studentilor dintr-o universitate.
//Campurile:
//- Nume
//- Data nasterii
//- Cod student (sa nu mai poata fi modificat dupa crearea studentului)
//- Array cu notele obtinute in primul semestru
//- Numarul total de studenti
//Metodele:
//- O metoda care sa ne intoarca numarul total de studenti
//- O metoda care sa ne returneze media notelor pe primul semestru
//- O metoda care sa ne intoarca varsta studentului
public class Student {

    private String numeStudent;
    private LocalDate dataNasteriiStudent;
    private int codStudent;
    private int[] NoteStudent;
    private static int numarTotalStudenti = 0;

    public Student(String numeStudent, LocalDate dataNasteriiStudent, int codStudent) {
        this.numeStudent = numeStudent;
        this.dataNasteriiStudent = dataNasteriiStudent;
        this.codStudent = codStudent;
        numarTotalStudenti += 1;
    }

    public  int getcodstudent() {
        return codStudent;
    }
    public double mediaNotelorStudent() {
        int sumaNotelor = 0;
        for (int i = 0; i < NoteStudent.length; i++ ) {
            sumaNotelor = sumaNotelor + NoteStudent[i];
        }
        return (double)sumaNotelor / NoteStudent.length;
    }
    public static int getNumarTotalStudenti() {
        return numarTotalStudenti;
    }

    public int getVarsta() {
        LocalDate localDate = LocalDate.now();
        int varsta = localDate.getYear() - dataNasteriiStudent.getYear();
        if (localDate.getMonthValue() > dataNasteriiStudent.getMonthValue()) {
            varsta += 1;
        } else if (localDate.getMonthValue() == dataNasteriiStudent.getMonthValue() && localDate.getDayOfMonth() >= dataNasteriiStudent.getDayOfMonth()){
            varsta += 1;
        }
        return varsta;
    }

    public void setNoteStudent(int[] note) {
       NoteStudent = note;
    }

}
