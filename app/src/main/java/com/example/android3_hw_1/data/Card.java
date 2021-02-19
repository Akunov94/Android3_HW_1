package com.example.android3_hw_1.data;

import java.util.Objects;

public class Card<CardContent> {
    private boolean isFaceUp;
    private boolean isMatched;
    private CardContent content;

    public Card(boolean isFaceUp, boolean isMatched, CardContent content) {
        this.isFaceUp = isFaceUp;
        this.isMatched = isMatched;
        this.content = content;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }

    public CardContent getContent() {
        return content;
    }

    public void setContent(CardContent content) {
        this.content = content;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card<?> card = (Card<?>) o;
        return Objects.equals(content, card.content);
    }

}
