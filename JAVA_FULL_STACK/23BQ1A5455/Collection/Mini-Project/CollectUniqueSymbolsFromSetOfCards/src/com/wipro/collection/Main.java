package com.wipro.collection;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Card> cardSet = new TreeSet<>(new Comparator<Card>() {

            @Override
            public int compare(Card c1, Card c2) {

                return Character.compare(c1.getSymbol(), c2.getSymbol());

            }

        });

        int totalCards = 0;

        while (cardSet.size() < 4) {

            System.out.println("Enter a card :");

            char symbol = Character.toLowerCase(sc.next().charAt(0));

            int number = sc.nextInt();

            totalCards++;

            Card card = new Card(symbol, number);

            cardSet.add(card);

        }

        System.out.println("Four symbols gathered in " + totalCards + " cards.");

        System.out.println("Cards in Set are :");

        for (Card card : cardSet) {

            System.out.println(card.getSymbol() + " " + card.getNumber());

        }

        sc.close();

    }

}