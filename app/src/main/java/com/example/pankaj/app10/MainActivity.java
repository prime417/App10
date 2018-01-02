package com.example.pankaj.app10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    SecureRandom    secureRandom = new SecureRandom();

    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int number4 = 0;
    int number5 = 0;
    int number6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtNumber1 = findViewById(R.id.txtNumber1);
        final TextView txtNumber2 = findViewById(R.id.txtNumber2);
        final TextView txtNumber3 = findViewById(R.id.txtNumber3);
        final TextView txtNumber4 = findViewById(R.id.txtNumber4);
        final TextView txtNumber5 = findViewById(R.id.txtNumber5);
        final TextView txtNumber6 = findViewById(R.id.txtNumber6);

        ImageView imgDice = findViewById(R.id.imgDice);
        final ImageView imgNumber1 = findViewById(R.id.imgDiceNumber1);
        final ImageView imgNumber2 = findViewById(R.id.imgDiceNumber2);
        final ImageView imgNumber3 = findViewById(R.id.imgDiceNumber3);
        final ImageView imgNumber4 = findViewById(R.id.imgDiceNumber4);
        final ImageView imgNumber5 = findViewById(R.id.imgDiceNumber5);
        final ImageView imgNumber6 = findViewById(R.id.imgDiceNumber6);

        Button btnRolltheDice = findViewById(R.id.btnRollTheDice);

        btnRolltheDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int rollTimes = 0 ; rollTimes <= 5000000; rollTimes++){

                    int faceNumber = 1 + secureRandom.nextInt(6);

                    switch (faceNumber){

                        case 1:
                            ++number1;
                            break;
                        case 2:
                            ++number2;
                            break;
                        case 3:
                            ++number3;
                            break;
                        case 4:
                            ++number4;
                            break;
                        case 5:
                            ++number5;
                            break;
                        case 6:
                            ++number6;
                            break;

                    }
                }

                txtNumber1.setText(number1 + "");
                txtNumber2.setText(number2 + "");
                txtNumber3.setText(number3 + "");
                txtNumber4.setText(number4 + "");
                txtNumber5.setText(number5 + "");
                txtNumber6.setText(number6 + "");

                imgNumber1.setImageResource(R.drawable.dice1);
                imgNumber2.setImageResource(R.drawable.dice2);
                imgNumber3.setImageResource(R.drawable.dice3);
                imgNumber4.setImageResource(R.drawable.dice4);
                imgNumber5.setImageResource(R.drawable.dice5);
                imgNumber6.setImageResource(R.drawable.dice6);
            }
        });

    }
}
