package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int myCountValue = 0;

    Button btMinus, btPlus;
    TextView txCount, txReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMinus = findViewById(R.id.btMinus);
        btPlus = findViewById(R.id.btPlus);
        txCount = findViewById(R.id.txCount);
        txReset = findViewById(R.id.txReset);

        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (myCountValue != 0){
                    myCountValue = myCountValue - 1;
                    txCount.setText(myCountValue + "");
                }
            }
        });

        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCountValue = myCountValue + 1;
                txCount.setText(String.valueOf(myCountValue));
            }
        });

        txReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCountValue = 0;
                txCount.setText(String.valueOf(myCountValue));
            }
        });


    }
}