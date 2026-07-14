package com.wipro.collection;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Character, ArrayList<Card>> map = new TreeMap<>();

        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");

            char symbol = Character.toLowerCase(sc.next().charAt(0));
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            if (map.containsKey(symbol)) {

                map.get(symbol).add(card);

            } else {

                ArrayList<Card> list = new ArrayList<>();
                list.add(card);
                map.put(symbol, list);

            }

        }

        System.out.println("Distinct Symbols are :");

        for (char ch : map.keySet()) {

            System.out.print(ch + " ");

        }

        System.out.println();

        for (Map.Entry<Character, ArrayList<Card>> entry : map.entrySet()) {

            char symbol = entry.getKey();
            ArrayList<Card> cards = entry.getValue();

            System.out.println("\nCards in " + symbol + " Symbol");

            int sum = 0;

            for (Card card : cards) {

                System.out.println(card.getSymbol() + " " + card.getNumber());

                sum += card.getNumber();

            }

            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);

        }

        sc.close();

    }

}