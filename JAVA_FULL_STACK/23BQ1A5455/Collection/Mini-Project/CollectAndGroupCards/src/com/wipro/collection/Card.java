package com.wipro.collection;

public class Card {

    private char symbol;
    private int number;

    public Card() {

    }

    public Card(char symbol, int number) {
        this.symbol = Character.toLowerCase(symbol);
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = Character.toLowerCase(symbol);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }

}