package com.sda.codingFundamentals.Task19;

public class Poem {
    private Author author;

    private int stropheNumbers;

    Poem (Author author, int stropheNumbers) {
        this.author = author;
        this.stropheNumbers = stropheNumbers;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public Author getAuthor(){
        return author;
    }
}
