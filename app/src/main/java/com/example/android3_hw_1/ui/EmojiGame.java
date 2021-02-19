package com.example.android3_hw_1.ui;

import com.example.android3_hw_1.data.Card;
import com.example.android3_hw_1.data.Game;

import java.util.List;

public class EmojiGame {
    private final Game<String> game;

    public EmojiGame() {
        List<String> content = List.of("👻", "🎃", "👹","👻", "🎃", "👹");
        game = new Game<>(content);
    }
    public void choose(Card<String> card) {
        game.choose(card);
    }

    public List<Card<String>> getCards() {
        return game.getCards();
    }
}

