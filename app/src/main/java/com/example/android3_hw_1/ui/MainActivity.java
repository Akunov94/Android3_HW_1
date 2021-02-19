package com.example.android3_hw_1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.android3_hw_1.R;
import com.example.android3_hw_1.data.Card;

public class MainActivity extends AppCompatActivity implements EmojiAdapter.Listener{
    private RecyclerView recyclerView;
    private EmojiAdapter adapter;
    private EmojiGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_cards);
        game = new EmojiGame();
        adapter = new EmojiAdapter(game, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void cardClick(Card<String> card) {
        game.choose(card);

        adapter.notifyDataSetChanged();
    }


}