package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import static com.londonappbrewery.magiceightball.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( layout.activity_main);

        final ImageView ballDisplay = findViewById ( id.eightBall);
        final int[] ballArray= {drawable.ball1,
                drawable.ball2,
                drawable.ball3,
                drawable.ball4,
                drawable.ball5};
        Button AskButton;
        AskButton = findViewById ( id.AskButton );
        AskButton.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Random  randomNumberGenerator=new Random();
                int ask1= randomNumberGenerator.nextInt (5);
                ballDisplay.setImageResource ( ballArray[ask1] );

            }
        } );


    }
}