package com.wipro.collection;

import java.util.ArrayList;
import java.util.List;

public class CardBO {

    private List<Card> cardList;

    public CardBO() {
        cardList = new ArrayList<>();
    }

    // Add a card
    public void addCard(Card card) {
        cardList.add(card);
    }

    // Return all cards
    public List<Card> getCardList() {
        return cardList;
    }

    // Check whether a symbol already exists
    public boolean containsSymbol(char symbol) {

        for (Card card : cardList) {

            if (Character.toUpperCase(card.getSymbol()) ==
                Character.toUpperCase(symbol)) {

                return true;

            }

        }

        return false;
    }

    // Count unique symbols
    public int getUniqueSymbolCount() {

        List<Character> symbols = new ArrayList<>();

        for (Card card : cardList) {

            char ch = Character.toUpperCase(card.getSymbol());

            if (!symbols.contains(ch)) {

                symbols.add(ch);

            }

        }

        return symbols.size();
    }

}