package com.example.tarot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ImageView card1, card2, card3, card4, card5, deckBtn;
    ArrayList<Integer> cards;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deckBtn = (ImageView) findViewById(R.id.DeckBtn);
        card1 = (ImageView) findViewById(R.id.card1);
        card2 = (ImageView) findViewById(R.id.card2);
        card3 = (ImageView) findViewById(R.id.card3);
        card4 = (ImageView) findViewById(R.id.card4);
        card5 = (ImageView) findViewById(R.id.card5);


        card1.setVisibility(View.INVISIBLE);
        card2.setVisibility(View.INVISIBLE);
        card3.setVisibility(View.INVISIBLE);
        card4.setVisibility(View.INVISIBLE);
        card5.setVisibility(View.INVISIBLE);

        cards = new ArrayList<>();

        cards.add(1);
        cards.add(2);
        cards.add(3);
        cards.add(4);
        cards.add(5);

        deckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.shuffle(cards);

                assignImages(cards.get(0), card1);
                assignImages(cards.get(1), card2);
                assignImages(cards.get(2), card3);
                assignImages(cards.get(3), card4);
                assignImages(cards.get(4), card5);


                card1.setVisibility(View.VISIBLE);
                card2.setVisibility(View.VISIBLE);
                card3.setVisibility(View.VISIBLE);
                card4.setVisibility(View.VISIBLE);
                card5.setVisibility(View.VISIBLE);

                Toast.makeText(MainActivity.this, "Cards dealt", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void assignImages(int card, ImageView image) {
        switch(card) {
            case 1:
                image.setImageResource(R.drawable.betonit);
                break;
            case 2:
                image.setImageResource(R.drawable.improvement);
                break;
            case 3:
                image.setImageResource(R.drawable.love);
                break;
            case 4:
                image.setImageResource(R.drawable.chance);
                break;
            case 5:
                image.setImageResource(R.drawable.play);
                break;
        }
    }

}