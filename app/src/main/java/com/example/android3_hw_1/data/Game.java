package com.example.android3_hw_1.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Game<CardContent> {
    private final List<Card<CardContent>> cards = new ArrayList<>();
    private boolean b;
    public Game(List<CardContent> contents) {
        for (int i = 0; i < contents.size(); i++) {
            cards.add(new Card<>(false, false, contents.get(i)));
            cards.add(new Card<>(false, false, contents.get(i)));
        }
        Collections.shuffle(cards);
    }

    public void choose(Card<CardContent> card) {
        b = false;
        card.setFaceUp(!card.isFaceUp());
        if (card.isFaceUp()) {
            findPairs(card);
        }
        if (b = true) {
            removePairs();
        }
    }

    private void removePairs() {
        Iterator<Card<CardContent>> i = cards.iterator();
        while (i.hasNext()) {
            Card<CardContent> someCard = i.next();
            if (someCard.isMatched() == true) {
                i.remove();
            }
        }
    }

    private void findPairs(Card<CardContent> card) {
        b = false;
        for (Card<CardContent> searchCard : cards) {
            if (searchCard.isFaceUp() && searchCard.getContent() == card.getContent()) {
                card.setMatched(!card.isMatched());
                searchCard.setMatched(!searchCard.isMatched());
            } else {
                searchCard.setFaceUp(false);
                searchCard.setFaceUp(false);
            }
            if (searchCard.isMatched() == true && card.isMatched() == true) {
                b = true;
            }
        }
    }

    public List<Card<CardContent>> getCards() {
        return cards;
    }
}
