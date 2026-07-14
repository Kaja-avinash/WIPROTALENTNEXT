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
    public int hashCode() {
        return Character.hashCode(symbol);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Card other = (Card) obj;

        return symbol == other.symbol;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }

}