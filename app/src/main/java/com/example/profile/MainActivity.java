package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private ImageView imageViewDice2;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice2 = findViewById(R.id.image_view_dice2);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rollDice();
            }
        });


    }


    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;
        int randomNumber2 = rng.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.ic_one);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.ic_two);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.ic_tree);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.ic_four);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.ic_five);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.ic_six);
                break;
        }

        switch (randomNumber2) {
            case 1:
                imageViewDice2.setImageResource(R.drawable.ic_one);
                break;
            case 2:
                imageViewDice2.setImageResource(R.drawable.ic_two);
                break;
            case 3:
                imageViewDice2.setImageResource(R.drawable.ic_tree);
                break;
            case 4:
                imageViewDice2.setImageResource(R.drawable.ic_four);
                break;
            case 5:
                imageViewDice2.setImageResource(R.drawable.ic_five);
                break;
            case 6:
                imageViewDice2.setImageResource(R.drawable.ic_six);
                break;
        }
    }
}



